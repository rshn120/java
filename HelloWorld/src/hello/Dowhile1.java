package hello;
import java.util.Scanner;

public class Dowhile1 {
	public static void main(String[] args) {
		System.out.println("메시지 입력");
		System.out.println("프로그램 종료 q");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.contentEquals("q"));
		System.out.println();
		System.out.println("종료");
	}

}
