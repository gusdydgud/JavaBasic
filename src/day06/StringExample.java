package day06;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		
		//문자열을 다루는 다양한 방법. - 
		//문자열은 사실은 char문자들의 배열이 합쳐진것
		//index를 가짐
		//문자열.매서드명()
		String str = "안녕하셈";
		System.out.println(str.charAt(3));
		//문자열길이
		str.length();
		System.out.println(str.length());
		//문자찾기
		str.indexOf("안");
		System.out.println(str.indexOf("녕"));
		System.out.println(str.indexOf("흠"));//없는 문자라면 -1반환
		
		//문자변경하기
		str.replace("안", "반갑");
		System.out.println(str.replace("안", "반갑"));
		System.out.println(str);//원본문자열은 그대로
		String str2 = "아 집에 가고 싶다~ ㅜㅜ";
		String r2 = str2.replace(" ", "");
		System.out.println(r2);
		str2 = str2.replace(" ", ""); // 원본문자열이 공백삭제
		//문자열 자르기
		System.out.println(str.substring(2)); // 2번 미만 절삭
		System.out.println(str);
		System.out.println(str.substring(0,2)); // 0< <2 추출
		//문자열자르기
		String str3 = "010-1234-5678";
		String[] r3 = str3.split("-"); // - 기준으로 잘라서 배열로 반환
		String r4[]=str3.split(""); // 한글자씩 잘라줌
		char r5[] = str3.toCharArray();
		
		System.out.println(Arrays.toString(r3));
		System.out.println(Arrays.toString(r4));
		System.out.println(Arrays.toString(r5));
		//양측공백제거
		String str4 = " hello world ";
		System.out.println(str4.trim());
		// 문자열 비교 
		System.out.println("홍길동".equals("홍길동")); //문자열이 같으면 true 다르면 false
		//문자열 대소비교 (앞문자 아스키코드 - 뒤문자 아스키코드)
		System.out.println("ABC".compareTo("ABC")); // 0 = 같은문자
		System.out.println("ABC".compareTo("ABD")); // -1 =음수라면 - 뒤에 문자가 사전적으로 뒤에있음
		System.out.println("ABC".compareTo("ABB")); // 1 = 양수 뒤에문자가 사전적으로 앞에있음
		//문자열 합치기
		System.out.println(String.join("->", "홍","길","동"));
		System.out.println(String.join("->", "홍","길","동","입","니","당","ㅋ"));
		
		
		// TODO Auto-generated method stub

	}

}
