package day04;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//어떤수 x까지의 짝수들의 합
		
		int i =1;
		int sum = 0;
		while( i <=10) {
			if(i%2==0){
				sum+=i;
			//	System.out.println(sum);
			}
			i++;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
