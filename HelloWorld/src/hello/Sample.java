package hello;

public class Sample {
	public static void main(String[] args) {
	//byte a = 127;
	//a = (byte)(a + 1);
	//System.out.println("result : " + a);
		
	int num1 = 10;
	num1++; // num1 = num1 + 1;
	int a = 5, b = 7;
	num1 = a++; // + ++b;     // a++ -> 6 , ++b -> 8;
	System.out.println(a +", " + ++b);
	System.out.println("num1 : " + num1); 
	
	System.out.println(3 != 5);
	if(3<5)
		System.out.println("Ok");
//	else
//		System.out.println("NO");
	num1 += 3; //num1 = num1 + 3;
	num1 *= 3; //num1 = num1 * 3;
			}
}
