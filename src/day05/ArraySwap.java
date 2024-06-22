package day05;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
//		int x = 5;
//		int y = 10;
//		int tem = 0 ;
//		tem = x;
//		x = y;
//		y = tem;
//		System.out.println(x+" " +y);
		
		//랜덤한 두 수를 이용해서 배열의 자리를 바꾸기
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int a= (int)(Math.random()*10);
		int b= (int)(Math.random()*10);
		
		System.out.println(a+" " +b);
		int tem = arr[a];
		arr[a] = arr[b];
		arr[b] = tem;
		System.out.println(Arrays.toString(arr));
		
		
		
		// TODO Auto-generated method stub

	}

}
