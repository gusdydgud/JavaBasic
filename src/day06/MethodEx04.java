package day06;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		//배열도 메서드의 매개변수 or 반환으로 사용할 수 있을까? yes
		int arr[] = {1,2,3,4,5,6,7};
		method01(arr);
		int result[] = method02();
		System.out.println(Arrays.toString(result));
		System.out.println("---------------------------");
		int a =1;
		int arr2[] = {1,2,3};
		method03(a, arr2);
		System.out.println(a+" "+Arrays.toString(arr2));
		// TODO Auto-generated method stub

	}
	
	//매개변수로 배열을 받는 메서드.
	static void method01(int arr[]) {
		for(int i =0 ; i<arr.length;i++) {
			System.out.print(arr[i]+"->");
		}
	}
	//반환으로 배열을 리턴하는 메서드
	static int[] method02() {
		int arr[] = {1,2,3,4};
		return arr;
	}
	//배열을 전달할 때는 흥미로운 사실이 하나 있음.  call by reference
	static void method03(int a,int arr[]) {
		a = 10;// a를 10으로 변경
		arr[0] = 10; //0번째 인덱스를 10으로 변경
		
		
	}
	
}
