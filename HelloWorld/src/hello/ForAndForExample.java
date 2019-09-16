package hello;

public class ForAndForExample {
	public static void main(String[] args) {
//		int a=2;
//		int b=1;
/*		do {
			System.out.println(4+"*"+i+"="+i*4);
			i++;
		}while(i < 10);
*/		
		
		
		for(int i =2; i < 10; i++) {
			System.out.print("<<"+ i + "단>>"+ "  ");
		}   System.out.println();
		
		for(int i=1; i<10;i++) {
			for(int j = 2; j < 10; j++)  {
				
			System.out.print(j+"*"+i+"="+" "+i*j+"  ");		   
		    }System.out.println();
		}
/*		while(a < 10) {
			System.out.println("<<"+a+"단>>");
			int j=1;

			while(j < 10) {
			System.out.println(a+"*"+j+"="+(a*j));
			j++;
			}a++;
		}
*/
	}

}
