package hello;

public class Exercise403 {
	public static void main(String[] args) {
		int a = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) a+=i;
		}
		System.out.println("3배수의 합 : " +a);
	}

}
