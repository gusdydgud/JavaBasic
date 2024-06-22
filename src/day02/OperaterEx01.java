package day02;

public class OperaterEx01 {

	public static void main(String[] args) {
//		단항 연산자 항이 하나인거
//		부호 연산자
		int i = +3;
		int j = -1;
//		증감 연산자 ++, --
		int k = 1;
		int h = k++; // ++이 뒤에 붙으면 후위연산 - 먼저값이 대입되고, 그 다음에 증가
		
		
		System.out.println("k값 : "+k);
		System.out.println("h값 : "+h);
		
		int x = 1;
		int y = ++x; // ++이 앞에 붙으면 전위연산 - 먼저 값이 증가되고, 그 다음에 대입
		
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		System.out.println("------------------");
		
		//비트연산자 ~ (많이안씀)
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b+1); // -10 - 더 했을때 0 이 되는 수
		
		System.out.println("-----------------");
		
		//논리 반전 연산자 !
		System.out.println(!true);
		System.out.println(!false);// 조건식을 세울 때 사용됨
		boolean bool = !true;
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
