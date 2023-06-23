package variable;

public class Ex1 {

	public static void main(String[] args) {
		
		/* 상수(Constant)
		 * -변수의 반대 개념으로 항상 고정된 데이터(변하지 않는 데이터)
		 * -실제 사용하는 데이터9상수)를 리터럴(Literal)이라고도 한다.
		 * ex) 정수형 리터럴 1, 실수형 리터럴 3.14 등
		 * */
		System.out.println(1); //정수형(int) 리터럴
		System.out.println(3.14); //실수형(double) 리터럴
		
		System.out.println('A'); //문자형(char) 리터럴
//		System.out.println('AB'); //오류 문자형은 1개의 문자만 가능
		
		System.out.println(true); //논리형(boolean) 리터럴 (true 또는 false => 예약어) 무조건 소문자
		
		System.out.println(100L); //정수형(long) 리터럴
		System.out.println(1.5f); //실수형(float) 리터럴
		System.out.println("Hello, World"); //문자열형 리터럴
	}

}
