package variable;

public class Ex3 {
	
	public static void main(String[] args) {
		/* 기본 데이터 타입 ( 기본형, Primitive Type)
		 * 메모리에 효율적인 사용을 위해 사이즈별로 나누어 놓음
		 * -자바에서 기본적으로 사용하는 데이터 타입은 8가지
		 * 				1Byte	2Byte	4Byte	8Byte
		 * --------------------------------------------
		 * 1. 정수형		byte	short	int		long
		 * 2. 실수형						float
		 * 3. 문자형				char(정수형)
		 * 4. 논리형		boolean
		 * */
		byte b = 127;
		System.out.println(b);
		
//		b = 128; 오류 => byte 타입은 -128~127 까지 이기 때문
		
		short s = 128;
		System.out.println(s);
		
//		s = 32768; 오류 => short 타입은 -32768 ~ 32767 까지 이기 때문
		
		int i = 32768;
		System.out.println(i);
		
		i = 2147483647; // 정수 리터럴에 접미사가 없을 경우 int로 취급
						// 최대 표현 가능한 숫자가 2147483647 까지
						// 따라서, 그 이상의 숫자를 표현할려면
						// 접미사 L을 붙여서 long타입을 사용해야한다.
						// 대문자를 이용하는 이유는 l은 다른거랑 비슷헤서 헷갈리기 쉽기 때문
		
		long l = 2147483648L;
		System.out.println(l);
		
		
//		i = 100L; 오류 접미사 L이 붙음으로써 int 변수에는 저장 불가
		
		float f = 3.14f; // float 타입은 접미사 f 또는 F를 붙여줘야함
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		char c = 'A' + 1;
		System.out.println(c);
		
		String str = "javascript";
		
		boolean bool = true; // 다른 언어에서는 1을 true로 판단하는 경우가 있음
		System.out.println(bool);
		
		bool = false; // 다른 언어에서는 0을 false로 판단하는 경우가 있음
		System.out.println(bool);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 65; //아스키코드 65 = A
		System.out.println(ch2);
		
		char ch3 = '\u0041'; // 유니코드 0041 = A
		System.out.println(ch3);
	}
}
