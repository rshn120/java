package hello;

public class ArrayExample {
	public static void main(String[] args) {

		int[] intAry= {10,20,30,40,50}; //int[] 타입의 값만 배열로 가능
		String[] strAry= {"Nice","Good","Hello"};
		
		System.out.println(intAry[0]);//배열은 0부터 ~까지 
		System.out.println(strAry[0]);
		
		for( int i=0; i<6;i++) {
			System.out.println(intAry[1]);
		}
		System.out.println("strAry의 크기:"+strAry.length); //문자열의 갯수
		strAry[0]="NNice";
		for(int i =0; i< strAry.length;i++) {
			System.out.println(strAry[i]);
		}

	}

}
