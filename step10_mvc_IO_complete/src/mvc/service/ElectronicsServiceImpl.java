package mvc.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.DuplicateFormatFlagsException;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    /** 
     * save.txt 문서 (과거에 직렬화 해서 저장된 파일이 있는지 )가 존재하는지 체크한 후
     * 없으면 ResourceBundle를 이용해서
     * list에 데이터 저장
     * 
     * 만약 있으면 save.txt에 있는 파일을
     * 로딩해서 list를 복원
     * 
     */
    private ElectronicsServiceImpl() {
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//dbInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key);
     	   String data[] = value.split(",");
     	   //System.out.println(key +" = " + value);
     	  
     	     list.add(new Electronics( Integer.parseInt(data[0]) ,data[1],   
     	    		 Integer.parseInt( data[2]), data[3]) );
     	  
        }
        
        //System.out.println(list);
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) throws ElectronicsArrayBoundsException {
		
		if (list.size() >= MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("최대 크기를 초과했습니다.");
		}
		// searchByModelNo를 불러왔을 때 예외가 발생되어야
		// 등록 되도록 해야한다.
		try {
			this.searchByModelNo(electronics.getModelNo());
			throw new DuplicateFormatFlagsException(electronics.getModelNo()+"중복이므로 등록할수 없습니다.");
		} catch (SearchNotFoundException e) {
			list.add(electronics);			
		}
	}

	@Override
	public List<Electronics> selectAll() {
		
		return new ArrayList<>(list);
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		// for 문으로 모델번호 검색
		for (Electronics ele : list) {
			if (ele.getModelNo() == modelNo) {
				return ele;
			}
		}
		throw new SearchNotFoundException("모델번호를 찾을 수 없습니다.");
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		// 모델번호를 찾고 수정하기
		Electronics ele = searchByModelNo(electronics.getModelNo());
		ele.setModelDetail(electronics.getModelDetail());   	// 수정
		
	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		// 모델번호를 찾고 삭제하기		
		Electronics ele = searchByModelNo(modelNo);
		list.remove(ele);
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		// 가격 비준으로 오름차순 정렬, 가격이 같으면 모델번호로 정렬
		Map<Integer, Electronics> priceMap = new TreeMap<>();
		
		for (Electronics ele : list) {
			priceMap.put(ele.getModelPrice(), ele);
		}
		List<Electronics> sort = new ArrayList<>(priceMap.values());
		
		return sort;
		
//		List<Electronics> sortList = new ArrayList<Electronics>(list);
//		Collections.sort(sortList, (o1, o2) -> {
//			int res = (o1.getModelPrice() == o2.getModelPrice()) ? 
//		});
		
	}
	
	// 종료 될 때 마지막 list의 정보를 파일에 저장하는 메서드
	@Override
	public void saveObject() throws Exception {
		
		try (ObjectOutputStream ojs = 
				new ObjectOutputStream(new FileOutputStream("src/mvc/view/save.txt", true))) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
} // 클래스 끝 