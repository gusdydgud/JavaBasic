package day05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//배열의 복사
		//2가지 개념 - 얕은복사,깊은복사
		//얕은복사 - 주소값을 통한 복사(원본배열에도 실제 영향을 미침)
		//깊은복사 - 완전새로운 배열을 만들어서 복사
		int arr[] = {1,2,3,4,5};
		int newArr[] = arr;
		System.out.println(arr+" "+newArr);
		newArr[0] = 100;
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));
		System.out.println("_---------------------------_");
		
		//깊은복사
		int arr2[] = new int[arr.length];
		for(int i =0 ; i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr2[0] = 1000;//값을 변경하더라도, 원본배열에는 영향이 없습니다.
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		// TODO Auto-generated method stub

	}

}
