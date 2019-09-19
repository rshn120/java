package hello;

public class AtoZ {
	public static void main(String[] args) {
//		char chr = 'A';
//		int num = chr;		
//		for(int i=1;i<27;i++) {
//			System.out.println(chr+", "+num);
//			num++;
//			chr++;		}
		String[] strAry = {"Hello","World","Good","Morning"};
		String[] copyAry = new String[strAry.length];

//		for(int i=0; i< strAry.length;i++) {
//			copyAry[i] = strAry[i];
//			System.out.println(copyAry);
//		}
//		for(String str : strAry) {
//			System.out.println(str);
//		}
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length); //원본 함수, 0번부터, 복사할 함수, 원본의 데이터만큼
		for(String str : copyAry) {
			System.out.println(str);
		}
	}

}
