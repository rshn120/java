package hello;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Nice"; //int, shor, long이랑 다름!
		String str2 = "Nice"; //string type의 주소값을 str1이 가지고 있다. 
		
		if(str1==str2) { //주소 값을 비교 
			System.out.println("동일한 참조값.");
		}else {
			System.out.println("다른 참조값.");
		}
		
		String str3=new String("Nice");
		String str4=new String("Nice");
		if(str3==str4) { //주소 값을 비교 new string으로 서로 다른 주소값을 가지고 있음.
			System.out.println("동일한 참조값.");
		}else {
			System.out.println("다른 참조값.");
		}
		if(str3.equals(str4)) { //주소값을 비교가 아니라 참조값을 비교함 -> equals
			System.out.println("동일 한 값");
		}else {
			System.out.println("다른 값");
		}
		
	}

}
