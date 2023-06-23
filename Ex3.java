package operator;

public class Ex3 {
	public static void main(String[] args) {
		/* 산술 연산시 자동 형변환
		 * - 산술 연산 전에 데이터 타입이 다르면
		 *   산술 연산을 수행하기 전 피연산자끼리의 데이터타입을 "일치"
		 *   시킨후에 연산 수행
		 *   
		 *   - 규칙 1. int타입보다 작은 타입끼리의 연산은 모두 int타입으로 변환 후 연산 수행
		 *            => 따라서, 결과값은 무조건 int 타입이 됨
		 *   ex) byte + byte = int + int = int
		 *   ex) char + int = int + int = int
		 *   
		 *   - 규칙 2. int 타입보다 큰 타입과의 연산은 큰 타입으로 변환 후 연산
		 *   ex) int + long = long + long
		 *   ex) int + double = double + double = double
		 * */
		
		char ch = 'A';
		System.out.println((char)(ch + 2));
		
		char ch2 = (char)(ch + 2);
		System.out.println(ch2);
		
		System.out.println("-----------------------------");
		
		int i = 100;
		long l = 200;
		
//		int i2 = i + l; // 오류! int + long = long
		int i2 = (int)(i + l);
		System.out.println(i2);
		
		System.out.println("-------------------------");
		
		System.out.println(10 / 3);
		
//		10 / 3                int / int = int               => 3
//		(double)(10 / 3)   double(int / int) = double       => 3.0
//		(double)10 / 3      double / int = double           => 3.33333333333335
//		10 / (double)3      int / double = double           => 3.33333333333335
		
		
	}
}
