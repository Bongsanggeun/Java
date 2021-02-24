package cho9.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10; 값을 바꿀 수 없음
		//y = 20; 값을 바꿀 수 없음. 여기있는 값들을 그대로 써야됨.
		
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}

}
