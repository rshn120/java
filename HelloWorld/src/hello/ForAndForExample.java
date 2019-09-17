package hello;

import java.util.Scanner;

public class ForAndForExample {
	public static void main(String[] args) {
		
		int a, b, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력.");
		a=sc.nextInt();
		System.out.println("두번째 값을 입력.");
		b=sc.nextInt();
//		if(a > b)
//			result = a;
//		else
//			result = b;
		
		result = (a > b ? a : b); //a값이 b값 보다 큰 경우 a 값을 result에 넣어주고 a값이 b보다 작을 경우 b 값을 result에 넣어준다.
		System.out.println("두 수 중에서 큰 수는 : "+result);
		
		sc.close();
		
//		int a=2;
//		int i=1;
/*		do {
			System.out.println(4+"*"+i+"="+i*4);
			i++;
		}while(i < 10);
*/		
		
/*		
		for(int i =2; i < 10; i++) {
			System.out.print("<<"+ i + "단>>"+ "  ");
		}   System.out.println();
		
		for(int i=1; i<10;i++) {
			for(int j = 2; j < 10; j++)  {
				
			System.out.print(j+"*"+i+"="+" "+i*j+"  ");		   
		    }System.out.println();
		}
*/
/*		
		int a=2;
		while(a < 10) {
			System.out.print("<<"+a+"단>>");
		a++; 
		}
		System.out.println();
			
		int j=1;	
			
			while(j<10) {
				int i=2;
				i++;
				while(j < 10)  {
				
				j++;
				System.out.print(j+"*"+i+"="+" "+i*j+"  ");		   
			    }System.out.println();
			}
		
	*/	
	}

}
