package hello;

//import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {
	
	int[] intAry= {2,3,4,5,6};
		int sum=0;
	//	int sum2=(ary[]);
	//	for(int i=0; i < ary; i++) {
	//		sum += ary;
	//	} System.out.println("합은 : "+sum);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("키를 입력하세요 : ");
//		double k = sc.nextDouble();
//		System.out.println("적정 몸무게"+tols(k));
	}
	
	public static int sum2(int[] ary) {
		int sum =0;
		for(int i=0; i < ary.length;i++) {
			sum += ary[i];
		}return sum;
	}
//	public static double tols(double k) {
//		return (k-100) * 0.9;
//		
//	}
	
	
	
//		double a = 41.0;
//		System.out.println(args[0]);
//		showName();
//		showAge(a);
//		showMe(176.5, 75.5);
//		int result = sum(4, 5);
//		System.out.println("결과값: "+result);
//		System.out.println(args[1]);
//		
//		int mi = minus(100, 30);
//		System.out.println("더하기 결과값: "+mi);
//		int mt = multi(10, 10);
//		System.out.println("빼기 결과값: "+mt);
//		double d = dv(100, 3);
//		System.out.println("나누기 결과값: "+d);
//	}
//	public static double dv(double a, double b) {
//		return a / b;
//	}
//	public static int multi(int a, int b) {
//		return a * b;
//	}
//	
//	public static int minus(int a, int b) {
//		return a - b;
//	}
//	
//	public static int sum(int a, int b) { //void 는 결과 값이 없는 것이고 return 값이 있는것은 int형이나 다른 걸로
//		return a + b;
//	}
//	
//	public static void showMe(double height, double weight) {
//		System.out.println("I am "+height+" cm and "+ weight +"kg");
//	}
//	
//	public static void showAge(double age) {
//		System.out.println("I am "+age+" years old.");
//	}
//	
//	public static void showName() {
//		System.out.println("Hello, my name is sanghyon.");
//	}

}
