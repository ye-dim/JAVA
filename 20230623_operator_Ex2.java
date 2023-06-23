package operator;

public class Ex2 {
	public static void main(String[] args) {
		/* 산술연산자 ( +, -, /, %)
		 * - 일반적인 사칙연산과 동일
		 * - % 연산자 : 나머지 연산자(퍼센트 연산자)라고 하며, 나눈 나머지 값을 반환
		 * */
		
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 3); // 10을 3으로 나눈 몫
		System.out.println(10 % 3); // 10을 3으로 나눈 나머지
		
		System.out.println("-----------------------------------");
		
		//산술연산자 자동 형변환
		byte b1 = 10, b2 = 20, b3;
//		b3 = b1 + b2; // 오류! byte + byte = int 이므로 byte타입인 b3에 저장 불가!
		b3 = (byte)(b1 + b2); // 연산 결과에 형변환 연산자를 적용!
		System.out.println(b3);
	}
}
