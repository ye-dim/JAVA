package operator;

public class Ex1 {

	public static void main(String[] args) {
		
		int i =3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		/* 단항 연산자 (증강 연산자0 (++, --)
		 * 
		 * 1. 선행 연산자
		 *  - 피연산자의 앞쪽(좌측)에 붙여서 값을 1증가 또는 감소시키는데
		 *    먼저 피연산자의 값을 증가 또는 감소시킨 후에 다른 연산에 참여
		 *    ex) ++i, --i
		 *    
		 * 2. 후행연산자
		 *  - 피연산자의 뒷쪽(우측)에 붙여서 값을 1증가 또는 감소시키는데
		 *    피연산자를 먼저 다른 연산에 참여시킨 후 피연산자 값을 1증가 또는 감소
		 *    ex) i++, i--
		 * */
		
		int x1 = 5;
		int y1 = ++x1; //선행연산자
		// => x1의 값을 먼저 1증가시킨 후, 대입연산자를 통해 x1값을 y1에 대입
		
		int x2 = 5;
		int y2 = x2++; //후행연산자
		// => x2의 값을 먼저 y1에 대입한 후, x2의 값을 1증가시킴
		
		System.out.println("x1 : " + x1 + ", y1 : "+ y1);
		System.out.println("x2 : " + x2 + ", y2 : "+ y2);
		System.out.println("---------------------------------");
		
		int x = 10, y = 5;
//		int z = ++x + y--;
		x++;
		int z = x + y;
		y--; //코드는 가독성이 제일 즁요 / 굳이 한 줄에 다 끼워넣기 X
		
		System.out.println(x + ", " + y + ", " + z);
	}

}
