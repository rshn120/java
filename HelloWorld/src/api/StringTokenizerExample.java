package api;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how1: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();//countTokens()는 꺼내지 않고 남아 있는 토큰의 수를 가지고 있다.
		for(int i=0; i<countTokens;i++) {
			String token = st.nextToken();//nextToken()메소드에서 토큰 하나를 꺼내오면 StringTokenizer객체에는 해당
			System.out.println(token); //  토큰이 없어진다. 더 이상 가져올 토큰이 없을 경우 에러가 난다.
			//							그래서 아래 hasMoreTokens()를 써야함
			System.out.println();
		}
		//how2: 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) { //꺼내올 token이 있는지 조사후 nextToken()메소드를 호출한다.
			String token = st.nextToken();
			System.out.println(token);
			
		}
		
	}
}
