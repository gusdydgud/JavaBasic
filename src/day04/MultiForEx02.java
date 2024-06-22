package day04;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		
		//사각형 출력.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i<= b; i++) {
			for(int j = 1;j<=a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
