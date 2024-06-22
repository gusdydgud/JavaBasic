package day04;

import java.util.Arrays;

public class WhileEx03 {

	public static void main(String[] args) {
		
		
		//배열에 순서대로 값을 저장
		int arr[] = new int[10];
		int i =0;
		while(i<arr.length) {
			
			arr[i] = i+1;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		//배열의 반복.
//		
//		int arr[] = {1,2,3,4,5,6,7,8,9};
//		int sum=0;
//		System.out.println();
//		int i = 0;
//		while(i<arr.length) {
//			sum+=arr[i];
//			System.out.println(arr[i]);
//			i++;
//			
//		}
//		System.out.println(sum);
//		
		
		
		
		// TODO Auto-generated method stub

	}

}
