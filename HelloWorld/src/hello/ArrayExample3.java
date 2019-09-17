package hello;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[][] intAry = new int[2][];
		intAry[0] = new int[3];
		intAry[1] = new int[4];
		int a = 8;
		int sm =0;
		int smt =0;
		for( int i = 0; i < intAry.length; i++) {
			for( int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = a++;
			}
		}
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j< intAry[i].length; j++) {
				sm += intAry[i][j];
			}
			
		}System.out.print("0행 합:" + sm);
		
		for(int i =0; i < intAry.length;i++) {
			for(int j=0;j<intAry.length;j++) {
				smt += intAry[j][i];
			}System.out.println("1행 합" + smt);
		}
		
	}
		
		
	

}
