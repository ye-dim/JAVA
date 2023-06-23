package operator;

import java.nio.file.spi.FileSystemProvider;

public class Ex7 {
	public static void main(String[] args) {
		/* 삼항 연사자 (조건연산자)
		 * - 연산에 참여하는 항이 3개인 연산자
		 * - 특정 조건에 따라 다른 값을 실행하는 연산자
		 *   => if ~ else 문과 동일한 기능을 수행
		 * - 2가지 경우의 수 (true 또는 false)에 대한 결과를 수행
		 * 
		 * < 기본 문법 >
		 * 조건식 ? 값1 : 값2
		 * => 조건식에는 결과값이 boolean 타입인 식만 올 수 있다.
		 * => 조건식 판별 결과가 true일 경우 값1 부분을 반환, false일 경우 값2 부분을 반환
		 * */
		
		int a = 10;
		String result = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
		a = 11;
		result = (a % 2 == 0) ? "짝수" : "홀수"; // : 기준으로 좌우 데이터 타입이 다르면 안됨 ex) "짝수" : 12
		System.out.println(result);
		
//		(a % 2 == 0) ? System.out.println("짝수") ; : System.out.println("홀수"); // : 기준 좌우 실행문이 오면 안 됨!!
		
		/* 삼항 연산자의 중첩 사용
		 * -경우의 수가 3가지 이상일 때 사용
		 * 
		 * < 기본 문법 >
		 * 조건식 1 ? 값1 : 조건식 2 ? 값2 : 값3
		 * */
		
		int num = 2;
//		String str = (num == 0) ? "0" : (num % 2 == 0) ? "짝수" : "홀수"; //가독성 별로 안 좋음
		String str = (num == 0) ? "0" : 
					 (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(str);
		
		System.out.println("------------------------------------");
		
		int n1 = 30;
		int n2 = 20;
		int max = (n1 > n2) ? n1 : n2;
		int min = (n1 < n2) ? n1 : n2;
		
		System.out.println(max);
		System.out.println(min);
	}
}
