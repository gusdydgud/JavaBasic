package day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		//0~100까지 랜덤한 점수 생성
		String grade;
		int point = (int)(Math.random() *101);
		System.out.println("랜덤한 점수는 : "+point);
		if( point >=60) {
			System.out.println("합격 입니다!");
			grade = "P";
		}
		else {
			System.out.println("불합격 입니다!!");
			grade = "F";
		}
		System.out.println("당신의 등급은: " + grade);
		
		
		// TODO Auto-generated method stub

	}

}
