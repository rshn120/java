package hello;

public class Exercise405 {
	public static void main(String[] args) {
		int x;
		int y;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				x=i;
				y=j;
				if((4*i)+(5*j)==60)
					System.out.println(x+" , "+y);
			}
		}
	}

}
