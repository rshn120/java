package api;

public class StringValueOfExample {
	public static void main(String[] args) {
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(10.5);
		String s3 = String.valueOf(true);
		//valueOf는 기본 값을 문자열로 변환한다.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
