package hello;

public class Exercise07 {
public static void main(String[] args) {
	int x=10;
	int y=5;
	System.out.println( (x>7) && (y<=5));
	/* x(10) > 7 = true 
	 *  && (and 연산) 두값이 모두 true일때 true
	 *  y(5) <= 5 y값이 5보다 크거나 같다 true
	 *  출력값 true
	 */ 
	System.out.println((x%3 ==2) || (y%2 !=1));
	/* x(10) % 3 나머지는 1 == 2   1과 2는 같지 않으니 false 
	 * || (or 연산) 둘중에 하나만 같을때 true
	 * y(5) %2 = 1  !=( 좌우 값이 다른지 비교.  같으니 결고는 false
	 * 좌변 값과 우변 값이 같아서 or 연산으로 false가 된다.
	 */
}
}
