package day05;

import java.util.Arrays;

public class ArrayInsert2 {

	public static void main(String[] args) {
		
		//배열의 중간에 추가
		/*
		 * 1. 배열의 크기 +1 생성
		 * 2. 배열을 옮겨담음
		 * 3. 새로운 배열의 마지막 인덱스 부터 타겟인덱스까지 값을 옴김
		 * 4. tagertIndex에 data를 추가함.
		 */
		int arr[] = {10,20,30,40,50};
		//targetIndex번째에 data를 추가
		
		int targetIndex = 2;
		int data = 100;
		//1
		int narr[] = new int [arr.length+1];
		for(int i = 0;i<arr.length;i++) {
			narr[i]=arr[i];
		}
		//2
//		for(int i = 0 ; i<arr.length;i++) {
//			if(targetIndex==i) {
//				narr[i+1] =arr[i];
//				narr[i] = data;
//				
//			}
//			if(i<targetIndex) {
//				
//				narr[i] = arr[i];
//			}
//			if(i>targetIndex) {
//				narr[i+1]=arr[i];
//			}
//		}
		for(int i  = narr.length-1;i>targetIndex;i--) {
			narr[i]=narr[i-1];
		}
		narr[targetIndex] = data;
		System.out.println(Arrays.toString(narr));
		
		
		
		
		// TODO Auto-generated method stub

	}

}
