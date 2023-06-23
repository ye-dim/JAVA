
public class Ex2 {

	public static void main(String[] args) {
		System.out.println(1 + 3);
		System.out.println(1.2 + 1.3);
		System.out.println(2 * 5);
		System.out.println(6 / 2);
		
		System.out.println('아');
		System.out.println("아이티윌");
//		System.out.println('아이티윌'); - 에러
		System.out.println("아");
		
		System.out.println(' ');
//		System.out.println('');-에러 그래서 ''보다는 ""를 주로 사용
		System.out.println(" ");
		System.out.println("");
		
		System.out.println("아이" + "티윌");
		System.out.println(1 + 1);
		System.out.println("1" + "1");
		
//		\ 다음은 무조건 문자로 인식
//		\n : 줄바꿈 \t : 탭만큼 간격을 띄움
		System.out.println("선생님이 말했다 \"아! 자바 재밋다!\"");
		System.out.println("선생님이 말했다\n\"아! 자바 너무 재밌다!\"");
		
		System.out.println("영어 국어 수학");
		System.out.println("90 80 70");
		
		System.out.println("영어\t국어\t수학");
		System.out.println("90\t80\t70"); //좀 더 깔끔하게 가능함
		
	}

}
