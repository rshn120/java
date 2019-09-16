package hello;

public class IntForAry {
	public static void main(String[] args) {
		int[] aAry = new int[5];
/*		aAry[0] = 10; 
		aAry[1] = 20;	
		aAry[2] = 30; 
		aAry[3] = 40;	
		aAry[4] = 50;
*/	int sum = 0;
		for(int i=0;i< aAry.length;i++) {//aAry[5] 선언을 해놔서 5개다. aAry.length를 선언해주는건 배열의 길이를 
			aAry[i] = i * 10 + 10;       //일일이 변경 하지 않아도 된다.
			System.out.println(aAry[i]);
		}
		for(int i =0;i<aAry.length;i++) {//예로 aAry[5]로 선언했다가 [10]으로 변경시 i<5 -> i<10 이렇게 일일이 변경
			System.out.println(aAry[i]); // 안해도 된다 그래서 aAry.length를 쓰는 것!!!
		sum=0;
		}
		for(int i=0;i<aAry.length;i++) {
			sum += aAry[i];
		}System.out.println("aAry 배열의 합: "+sum);

	}

}
