package cho9.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10; ���� �ٲ� �� ����
		//y = 20; ���� �ٲ� �� ����. �����ִ� ������ �״�� ��ߵ�.
		
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}

}
