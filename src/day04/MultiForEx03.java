package day04;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//반복문의 횟수가 일정하지 않고 바깥에 반복횟수에 따라서 다르게 회전하는 반복문
		int star =5;
		for(int i =1; i<=star;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("---------------------------");
		
//		for(int i=5; i>=1;i--) {
//			for(int j = 1; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i =1; i<=star;i++) {
			for(int j = star+1-i; j>=1;j--) {
				System.out.print("*");
				
			}System.out.println();
		}
		System.out.println("----------------------");
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */

		for(int i = 1;i<=5;i++) {
			for(int j =5;j>=1;j--) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println("----------------------");
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 */
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5-i;j++) {
				System.out.print(" ");
				
			}
			for(int k =2;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		// TODO Auto-generated method stub
		
		

	}

}
