package hello;

public class WhileExample {
	public static void main(String[] args) {
		int i=0;
		
		while(true) {
			System.out.println(i);
			if(i++ < 5)
				continue;
			System.out.println(3+" * "+i+" = "+(3*i));
			if (i==9)
				break;
			//i++;
			
		}
	}

}
