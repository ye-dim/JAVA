package variable;

/* 식별자(Identifier = ID) = 명명자
 * 1. 중복불가
 * 2. 대소문자 구분
 * 3. 길이제한 없음
 * 4. 공백사용불가
 * 5. 숫자로 시작 불가
 * 6. 특수문자 _(언더바, 언더스코어), $(달러)  두개만 사용 가능
 * 
 * 권장사항
 * 1. 의미있는 단어 사용
 * 2. 클래스, 인터페이스 등은 첫글자 대문자 사용
 *    변수, 메서드 등은 첫글자 소문자 사용
 * 3. 두 단어 이상의 조합은 Camel-case 표기법 사용
 *    (두번째 단어부터 첫글자를 대문자로 표시 ex) myName, maxSpeed)
 * 4. 상수는 모두 대문자로 표기하며
 *    단어와 단어 사이에는 _(언더스코어)로 구분함
 * */

public class Ex2 {

	public static void main(String[] args) {
		/* 변수 (Variable)
		 * -자바에서 사용된느 데이터를 저장하는 메모리 공간
		 * -한 번에 하나의 데이터만 저장 가능
		 * =>언제든 다른 데이터로 대체될 수 있다.(=변할 수 있다)
		 * -변수를 사용하기 위해선 변수 선언이 먼저 실행되어야 함
		 * 
		 * <변수 선언 기본 문법>
		 * 데이터타입 변수명;
		 * =>데이터타입 : 기본형 또는 참조형 타입명 명시
		 * =>변수명 : 식별자 작성 규칙에 따른 변수명 지정
		 * 
		 * <변수 초기화 기본 문법>
		 * 변수명 = 데이터(또는 변수명);
		 * =>우변의 데이터를 좌변의 변수에 저장(대입, 초기화)
		 * */
		int a;
//		System.out.println(a);
		
		a=10;
		System.out.println(a);
		System.out.println(a + 10);
		System.out.println(a); //a 안의 값은 아직 변경 안 됨
		
		a=20;
		System.out.println(a); //a의 값이 변경됨
		
//		선언과 초기화를 동시에
		int b=20;
		System.out.println(b);
		
//		동시에 여러개 	변수를 선언 가능
		int c, d;
		c=10;
		d=20;
		System.out.println(c);
		System.out.println(d);
		
//		동시에 여러개 변수를 선언과 함께 초기화
		int e = 10, f = 20; // int => 예약어, 키워드, 데이터 타입
		
		System.out.println(e);
		System.out.println(f);
		
		String name; // String => 클래스
		name = "이예림";
		System.out.println(name);
		
		int A = 10, B = 20, temp = B;
		
		B = A;
		A = temp; //swap문
		
		System.out.println("a : " + A);
		System.out.println("b : " + B);
		
	}

}
