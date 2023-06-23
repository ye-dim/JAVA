package variable;

public class Ex4 {

	public static void main(String[] args) {
		/* String 타입
		 * -문자열을 표현하기 위한 데이터타입
		 * -기본형이 아닌 참조형(Reference type)
		 * -1개 이상의 문자열을 큰 따옴표("")로 묶어서 표현
		 * -아무것도 포함하지 않는 문자열("")을 널스트링(null string)이라고 한다
		 * =덧셈 연산자(+)를 사용해서 문자열간 결합이 가능
		 * */
		
		String str = null;
//		String str = ""; //위에꺼랑 다름 위에거는 null값이고 이거는 공백인 주소를 가지고 있음
		
		String s1 = "String 타입을 char 타입과 다르다!";
		System.out.println(s1);
		
		String s2 = "";
		System.out.println(s2);
		
		String s3 = null;
		System.out.println(s3);
		
		// 덧셈 연산자(+)를 사용해서 문자열 결합이 가능
		// => 어떤 데이터(X)와 문자열을 결합하면 결합된 결과가 새로운 문자열로 생성됨
		//	  ex) X + "문자열" = "X문자열"
		//		 "문자열" + X = "문자열X"
		System.out.println("1" + "2");
		System.out.println(1 + "문자열");
		System.out.println(1 + 2 + "문자열");
		System.out.println("문자열" + 1 + 2);
		int a = 1 + 2;
		System.out.println("문자열" + a);
		System.out.println("문자열" + (1 + 2));
	}

}
