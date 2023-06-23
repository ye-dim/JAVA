package operator;

public class Ex5 {
	public static void main(String[] args) {
		/* 비교연산자(= 관계연산자)(>, >=, <, <=, ==, !=)
		 * -두 피연산자 간의 대소관계 등을 비교하여 true 또는 false 값 반환
		 * */
		int a = 10, b = 5;
		
		System.out.println("a > b 인가? " + (a > b));
		System.out.println("a < b 인가? " + (a < b));
		System.out.println("a >= b 인가? " + (a >= b));
		System.out.println("a <= b 인가? " + (a <= b));
		System.out.println("a == b 인가? " + (a == b));
		System.out.println("a != b 인가? " + (a != b));
		
		System.out.println("--------------------------------");
		// char 타입을 비교연산자에 사용시 정수 (유니코드)값을 비교
		System.out.println('A' > 'B');
//		System.out.println("A" > "B");
		System.out.println('A' == 65);
		
		System.out.println(3 == 3.0);
		System.out.println("--------------------------------");
		
		System.out.println(0.1 == 0.1f); // 근사치 표현에 의해 서로 다른 값으로 취급됨!
		
		System.out.println("--------------------------------");
		System.out.println("abc" == "abc");
		
		String s = "abc";
		System.out.println(s == "abc");
		
		String s2 = s + "de";
		System.out.println(s2 == "abcde"); // 참조 타입이기 때문에 false가 나옴 abcde 주소와 abc주소에 de주소를 더한 것은 다름
		
		System.out.println("--------------------------------");
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = "c";
		String str4 = str2 + "c";
		String str5 = str2 + str3;
		String str6 = "ab" + "c";
		
		System.out.println("< 동등비교 연산자로 비교 >"); // 변수의 저장되어 있는 "주소"를 비교
		System.out.println(str1 == str4);
		System.out.println(str1 == str5);
		System.out.println(str1 == str6);
		
		System.out.println(" < equals() 메서드로 비교 >"); // 주소에 있는 "값"을 비교
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str1.equals(str6));
	}
}
