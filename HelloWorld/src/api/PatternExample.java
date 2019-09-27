package api;

import java.util.regex.Pattern;
//Pattern클래서의 정적 메소드인 matches()메소드는 문자열을 정규 표현식으로 검증하는 기능을 제공
public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치");
		}else {
			System.out.println("정규식과 비일치");
		}
		
		regExp = "\\W+@]]w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치");
		}else {
			System.out.println("정규식과 비일치");
		}
	}
}
