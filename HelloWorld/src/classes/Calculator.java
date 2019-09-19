package classes;

public class Calculator {
	int plus(int x, int y) {
	int result = x + y;
	return result;
	}

	double avg(int a, int b) {
		int sum = plus(a, b);
		double result = sum / 2;
		return result;
		
	}
	void execute(int a, int b) {
		
		//int a,b; // a = 10, b = 20;
		double result = avg(a,b);
		println("result: "+result);
	}
	void println(String str) {
		System.out.println(str);
	}
}
