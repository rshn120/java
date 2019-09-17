package hello;

public class Bingo {
	public static void main(String[] args) {
		int[][] aa = new int[5][5];
		int a=0;
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j] = ++a;
				System.out.printf("%3d", aa[i][j]);
			}System.out.println();
		}System.out.println();
		
		for(int i=4;i>=0; i--) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.printf("%3d", aa[j][i]);
			}System.out.println();
		}

	}

}
