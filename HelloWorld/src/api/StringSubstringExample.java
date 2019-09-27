package api;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn="880815-1234567";
		//          01234567 0~5까지 담고 6은 제외 아래참고
		String firstNum = ssn.substring(0,6); //firstNum에 0~5까지 6자리를 담아라 "880815"
		System.out.println(firstNum);
		String secondNum = ssn.substring(7); //substring(7) 인덱스 7번째 
		System.out.println(secondNum);
	}
}
