package day06;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		//Queue - First In First Out (FIFO)
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
		pop();
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}
	static int arr[] = {1,2,3,4};
	static void push(int data) {
		//1
//		int tem[] = new int[arr.length+1];
		//2. 배열복사
		int tem[] = Arrays.copyOf(arr, arr.length+1); // 배열명 , 복사할 길이
		//3. 마지막에 데이터를 추가
		tem[tem.length-1] = data;
		//4. 원본배열 변경
		arr = tem;
		tem =null;
//		System.out.println(Arrays.toString(arr));
	}
	static int pop() {
		//삭제가 가능한 조건안에서
		
		//1. 삭제할 데이터 백업
		//2. 길이 -1 배열 생성
		//3. 배열의 1번째 요소 ~ 마지막까지 복사
		//4. 원본배열 변경
		//5. 삭제된 데이터를 반환
		if(arr.length>0) {
			int data =arr[0] ;
			int arr2[] = new int [arr.length-1];
			for(int i =0 ; i<arr2.length;i++) {
				arr2[i] = arr[i+1];
			}
		//	int tem[] = Arrays.copyOfRange(arr, 1, arr.length); //복사할배열, 시작위치 ,끝위치
			arr = arr2;
			arr2 = null;
			return data;
			
		}
		return 0;
	}
	
}
