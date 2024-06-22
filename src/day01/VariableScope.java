package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		int num = 100;
		int num2 = 200;
		
//		변수의 범위는 중괄호 안에서만 유효합니다.
		if(true)
		{
			int num1 = 10; //중괄호 안에서만 사용가능
			System.out.println(num);
//			이 중괄호 안에서 값을 사용 또는 변경하고, 중괄호 밖에서 사용하는경우 밖에 선언
			num2 = 20;
			
											
		}
		System.out.println(num2);
//		System.out.println(num1);
		
		// TODO Auto-generated method stub

	}

}
