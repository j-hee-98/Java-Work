package ex0224.overridingEx.goods;

public enum RequestResult {

	/**
	 * 배열의 경계를 벗어났을 때
	 */
	
	INSERT_OUTINDEX,
	
	/**
	 * 상품코드가 중복일 때
	 */
	INSERT_DUPLICATE,
	
	
	/**
	 * 등록이 성공했을 때
	 */
	INSERT_SUCCESS
}
