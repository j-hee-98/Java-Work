package ex0305.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	Map<Integer, String> map = new HashMap<>();
	public MapExam() {
		// put 은 key 없으면 추가, 있으면 value 수정
		map.put(40, "화정");
		String v = map.put(40, "둘리");
		System.out.println("v = "+v);
		/**
		 * put 의 리턴값은 key가 중복이 아니면 null
		 * key가 중복이면 수정 전 value의 값이 나옴
		 */
		map.put(30, "효라");
		map.put(20, "미미");
		map.put(90, "나영");
		
		System.out.println("map = "+map);
		System.out.println(map.size());
		
		/////key와 value를 조회////////////////////////////////////
		Set<Integer> keySet = map.keySet();	// map에 있는 key들의 정보를 조회
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
		System.out.println("---------개선된 for문---------");
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
		System.out.println("-----Map.Entry<k,v>-----");
		Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : set) {
			
			int key = entry.getKey();
			String s = entry.getValue();
			System.out.println(key+" = "+s);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new MapExam();
	}
}
