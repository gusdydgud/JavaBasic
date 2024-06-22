package day06;

public class MethodEx01 {

	
	public static void main(String[] args) {
		
		/*
		 * 메서드는, 다른 메서드안에서 선언할 수 없음.
		 * main은 사실 매서드임.
		 *-main 밖에 클래스안에서 어디서든 선언할 수 있습니다.
		 * 
		 */
		//함수의 호출
		int result = calSum();
		System.out.println("1~10까지 합: "+result);
		int result2 = calSum();
		System.out.println("1~10까지 합: "+result2);
		String s = ranstr();
		System.out.println(s);
		//리턴이 있는 함수는 출력문안에서 바로 호출이 가능
		System.out.println("결과: "+ranstr());
		// TODO Auto-generated method stub

	}
	
	//반환유형 메서드이름
	static int calSum() {

		//1~10 합계
		System.out.println("calSum호출됨");
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	}

	static String ranstr() {
		String str = "";
		for(char a = 'A';a<='Z';a++) {
			str+=a;
		}
		return str;
	}
	
}
