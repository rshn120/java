package api;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1=" 02";
		String tel2="123 ";
		String tel3="  1234 ";
		//trim 공백을 없애고 문자를 붙인다.
		String tel = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
	}
}
