package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		System.out.println("----------------------");
		//continue도 중첩에서 이름붙이기 됨
		
		int i = 1;
		while(i<=10) {
			
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			
		}
		// TODO Auto-generated method stub

	}

}
