package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}catch (Exception e) {
			String message = e.getMessage();
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public static void method() throws NoAccountException{
		throw new NoAccountException("봉상근 입금 계과자 없음");
	}
}