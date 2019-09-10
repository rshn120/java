package hello;

public class Hang1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		a++; //마지막에 + 1
		++b; //우선 + 1
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int c = (++a) + 10;
		int d = (b++) + 10;
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		boolean yn = true;
		System.out.println("YN:"+yn);
		yn= !yn;
		System.out.println("YN:"+yn);
	}

}
