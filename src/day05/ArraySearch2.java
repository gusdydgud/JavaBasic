package day05;

import java.util.Arrays;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,10,20,50,80,100};
		//이진탐색 - 알고리즘
		//반반 분할해서 값을 찾아가는 방법
		//조건 - 배열이 정렬 되어있어야함
		/*
		 * 1. start=0, end=배열의 마지막 을 처음에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는값인지 확인
		 * 4. 중간값이 찾는값보다 크면, end를 중간값 -1옮김
		 * 5. 중간값이 찾는값보다 작으면 , start를 중간값 +1옮김
		 * 반복 
		 */
		int find = 70;
		int start=0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;//짝수, 홀수 상관x
			if(arr[mid]==find) {//찾음
				System.out.println("찾는 값은:"+mid+"번째 위치함");
				break;// 더이상 값을 찾을 필요가 없음
				
			}
			if(arr[mid]<find) {
				start=mid+1;//시작값을 중간값+1
			}else {
				end = mid-1;
			}
		
			
		}
		if(start>end) {
			System.out.println(find+" 는 없습니다");
		}
		System.out.println(Arrays.binarySearch(arr, 80));
		int result = Arrays.binarySearch(arr, 80);
		System.out.println(result-1);
		//음수가 나오면 값이 없다는 뜻
		//양수가 나오면 해당 위치가나옴
		// TODO Auto-generated method stub

	}

}
