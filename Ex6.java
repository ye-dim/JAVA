package operator;

public class Ex6 {
	public static void main(String[] args) {
		/* (& Ampersend) (| Vertical bar) (^ Caret)
		 * 
		 * 논리연산자 (&&, ||, !, ^)
		 * - 두 피연산자 간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자는 모두 boolean 타입 데이터만 사용 가능하며,
		 *   결과값도 boolean 타입으로 리턴
		 *   
		 *   < AND 연산자 (& 또는 &&) -논리곱 >
		 *   - 두 피연산자 모두 true일 경우에만 결과가 true,
		 *     하나라도 false일 경우 결과값이 false
		 *     
		 *   < OR 연산자 (| 또는 ||) -논리합 >
		 *   - 두 피연산자 중 하나라도 true일 경우 결과값이 true,
		 *     모두 false일 경우에만 false
		 *     
		 *   < NOT 연산자(!) = 논리 부정 >
		 *   - 단항 연산자로, 현재 값을 반대로 반전
		 *   
		 *   < XOR 연산자(^) - 배타적 논리합 >
		 *   - 두 피연산자가 서로 다를 떼 true, 같으면 false
		 */
		
		boolean a = false;
		boolean b = true;
		
		// AND 연산자 (&&) : 둘 다 만족(true)할 경우에만 true
		System.out.println("false && false = " + (a && a));
		System.out.println("false && true = " + (a && b));
		System.out.println("true && false = " + (b && a));
		System.out.println("true && true = " + (b && b));
		System.out.println();
		
		// OR 연산자 (||) : 하나라도 만족(true)할 경우에 true
		System.out.println("false || false = " + (a || a));
		System.out.println("false || true = " + (a || b));
		System.out.println("true || false = " + (b || a));
		System.out.println("true || true = " + (b || b));
		System.out.println();
		
		// XOR 연산자 (^) : 피연산자의 값이 다를 경우 true
		System.out.println("false ^ false = " + (a ^ a));
		System.out.println("false ^ true = " + (a ^ b));
		System.out.println("true ^ false = " + (b ^ a));
		System.out.println("true ^ true = " + (b ^ b));
		System.out.println();
		
		// NOT 연산자 (!)
		System.out.println("!false = " + (!a));
		System.out.println("!true = " + (!b));
		
		// &&, || 을 사용하는 이유
		// => 불필요한 연산은 하지 않음 ( Lazy Evaluation)
		int i = 10;
		boolean result = i > 9 || i++ > 9;
		System.out.println(i);
		boolean result2 = i > 9 | i++ > 9;
		System.out.println(i);
		
	}
}
