package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//점수를 입력받아서 학점을 부여.
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력>");
		int point = sc.nextInt();
		if(point >=90) {
			if(point>=95) {
				System.out.println("A+학점");
			}
			else {
				System.out.println("A학점");
			}
			System.out.println("축하");
			//System.out.println("A학점");
		}
		else if(point >=80) {
			System.out.println("B학점");
		}
		else if(point>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("재수강!");
		}
		
		// TODO Auto-generated method stub

	}

}
