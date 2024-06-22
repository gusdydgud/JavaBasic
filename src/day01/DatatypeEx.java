package day01;

public class DatatypeEx {

	public static void main(String[] args) {
		
//		정수형 타입
		byte a = 127;// -128~127까지
		byte a1 = -128;// 컴퓨터에서 아주중요한 단위
		short b1 = 32767;
		short b2 = -32768;
		int c = 2147483647;// 인트형의 범위
		int c2 = -2147483648;
		long d = 12489104809124L;//long 타입에는 l을 붙여써야함
		System.out.println(d);
		/*
		 * 2진수 0b를 붙임
		 * 8진수 0을 붙임
		 * 16진수 0x를 붙임
		 * 
		 */
		int bin = 0b1010;//이진수 1010으로 저장
		System.out.println("이 진수 1010은: "+ bin + "입니다");
		System.out.println("------------------");
//		실수형 타입
		float f1 = 3.14f;//f를 붙여야함 double형이 기본임
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		float f2 = 3.141592653f; // float 형은 실수부분 7자리까지
		double d2 = 3.141592653; // double 형은 실수부분 15자리까지
		System.out.println(f2);
		System.out.println(d2);
		//e표기법 - 나타낼수 있는 소수점 자리가 너무 크거나, 작은경우에 컴퓨터가 알아서 써줌
		float f3 = 314.15e-2f;
		System.out.println(f3);
		float f4 =0.031415e2f;
		System.out.println(f4);
		System.out.println("----------------");
		
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
		
		
		
		// TODO Auto-generated method stub

	}

}
