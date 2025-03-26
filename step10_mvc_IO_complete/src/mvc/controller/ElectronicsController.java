package mvc.controller;

import java.util.DuplicateFormatFlagsException;

import mvc.dto.Electronics;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.service.ElectronicsService;
import mvc.service.ElectronicsServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;



/**
 * View와 Model 사이에서 중간 역할 
 *  : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
 *    호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 *    
 *    system.out을 사용하지 않고 successView, FailView를 사용해서 다시
 */

public class ElectronicsController {
	 private ElectronicsService service = ElectronicsServiceImpl.getInstance();

    /**
     * 전체검색
     */
    public void selectAll() {
		service.selectAll().forEach(e -> System.out.println(e));
    }
 

	 /**
     * 전자제품 등록 
     */
   
    public void insert(Electronics electronics) {
       try {
    	   service.insert(electronics);
    	   SuccessView.printMessage("등록이 완료되었습니다.");
//    	   System.out.println("");
       } catch (ElectronicsArrayBoundsException | DuplicateFormatFlagsException e){
    	   FailView.errorMessage("등록 실패 : "+e.getMessage());
//    	   System.out.println("등록 실패 : "+e.getMessage());
       }
    }

    /**
     * 모델번호에 해당하는 전자제품 검색
     * @param modelNo
     */
    public void searchByModelNo(int modelNo) {
    	try {
    		Electronics ele = service.searchByModelNo(modelNo);
    		if (ele != null) {
    			SuccessView.printSearchByModelNo(ele);
    		}
    	} catch (Exception e) {
    		FailView.errorMessage("검색 실패 : "+e.getMessage());
    	}
    } 

    /**
     * 모델번호에 해당하는 전자제품 수정하기 
     * @param electronics
     */
    public void update(Electronics electronics) {
    	try {
    		service.update(electronics);
    		SuccessView.printMessage("수정이 완료되었습니다.");
    	} catch (Exception e) {
    		FailView.errorMessage("수정 실패 : "+e.getMessage());
    	}
    }
    
    /**
     * 모델번호에 해당하는 전자제품 삭제하기 
     * @param electronics
     */
	public void deleteModelNo(int modelNo) {
		try {
			service.delete(modelNo);
			SuccessView.printMessage("삭제가 완료되었습니다.");
		} catch (Exception e) {
			FailView.errorMessage("삭제 실패 : "+e.getMessage());
		}
	}
	
	/**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
    public void selectSortByPrice() {
    	service.selectSortByPrice().forEach(e -> SuccessView.printSearchByModelNo(e));
    }
    
}











