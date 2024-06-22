package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	/*	for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case #"+(i+1)+(b+c)+" ");
			
		}*/
		int i = 1;
		while(i <=a) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
