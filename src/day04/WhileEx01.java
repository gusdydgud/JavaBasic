package day04;

public class WhileEx01 {

	public static void main(String[] args) {
		
		
		
		int a = 1; // 제어변수 - 반복문 횟수를 제어할 변수
		int result = 0;
		
		while(a<= 10) {
			result+=a;
			System.out.println("실행"+a+" "+result);
			a++; // 제어변수를 1증가 시켜서 반복조건이 언젠가 false가 되도록
		}
		System.out.println("반복문 종료!"+result);
		// TODO Auto-generated method stub

	}

}
