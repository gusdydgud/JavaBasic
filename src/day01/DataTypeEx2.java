package day01;

public class DataTypeEx2 {

	public static void main(String[] args) {
		
//		단일문자를 저장하는 char타입
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c2);
		
		System.out.println(c1);
//		알파벳에 숫자값을 지정. 아스키코드 1byte 문자체계
//		유니코드 - 2byte크기로 확장시키고 65536개의 문자를 표현
		char c3 = '가';
		char c4 = 44032;
		System.out.println(c3);
		System.out.println(c4);
		char c5 = '\uC00D';
		System.out.println(c5);
		System.out.println("--------------------");
		
//		문자열을 나타내는 String
		String s1 = "Hello ";
		String s2 = "World ";
		String s3 = "^o^";
		System.out.println(s1+s2+s3);
		//문자열은 +로 붙여서 출력하면 됩니다
		System.out.println("hello"+100);
		//문자열에 다른타입이 붙으면 -> 문자열이 됩니다
		System.out.println("200"+ 100);
		System.out.println(100+200+"300");
		System.out.println("A"+10);
		System.out.println('A'+10);
		// TODO Auto-generated method stub

	}

}
