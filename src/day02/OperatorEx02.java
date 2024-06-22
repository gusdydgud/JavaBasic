package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자
		
		//산술연산 + - = * / %
		int i = 7/3;
		int j = 7%3;
		int k = 7*3;
		System.out.println("i는: "+	i);
		System.out.println("j는: "+ j);
		System.out.println("k는: "+k);
		
		//비교연산자 >=,>,==,!=
		System.out.println(i == j);
		System.out.println( i!=j);
		System.out.println(i >=j);
		System.out.println(i<=j);
		System.out.println(i<j);
		System.out.println(k%2 == 0); //트루 라면 짝수
		System.out.println(k%2 != 0); //트루 라면 홀수
		System.out.println(k%5 == 0); //5의 배수
		System.out.println("----------------");
		
		// 비트연산자
		int a = 5;//0000 0101
		int b = 3;//0000 0011
		System.out.println(a & b); // 둘다 1이면 1 아니면 0 0000 0001
		System.out.println(a | b); // 둘중 1이면 1 아니면 0 0000 0111
		System.out.println(a ^ b); // 다르면 1 같으면 0    0000 0110
		
		//비트 쉬프트 << >>
		int num = 192;
		System.out.println(num >> 2);
		System.out.println(num << 2);
		
		
		
		// TODO Auto-generated method stub

	}

}
