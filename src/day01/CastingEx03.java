package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산시에도 형변환이 일어납니다.
		char c = 'A';
		int i = 2;
		//연산에서의 형변환
//		int 보다 작은 타입의 연산은 int형
		
		System.out.println(c+i); // int
		char cc = (char)(c+i);
		
		int k =3;
		double d =3.14;
		System.out.println(k+d);
//		int 보다 큰 타입은 큰 타입을 따라간다
		
		// TODO Auto-generated method stub

	}

}
