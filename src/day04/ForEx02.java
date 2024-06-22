package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		/*
		 * 소수판별하기
		 * 소수 - 약수가 1과 자기자신인수
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		int num = sc.nextInt();
		int cnt =0;
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		if(cnt ==2) {
			System.out.println(num+" 는 소수입니다");
		}else {
			System.out.println(num+" 는 소수가압니다");
		}
		
		
		// TODO Auto-generated method stub

	}

}
