package leetcode.week3;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] b = new char[5][5];
		int a = minPathSum(b);
		System.out.println(a);
	}

	private static int minPathSum(char[][] b) {
		int numberOfIslands = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] == '1') {
					numberOfIslands += getIslandCount(b, i, j);
				}
			}
		}
		return numberOfIslands;
	}

	private static int getIslandCount(char[][] b, int i, int j) {
		if(i<0 || i>=b.length || j<0 || j>=b[i].length || b[i][j]=='0') {
			return 0;
		}
		b[i][j] = '0';
		getIslandCount(b, i-1, j);
		getIslandCount(b, i+1, j);
		getIslandCount(b, i, j+1);
		getIslandCount(b, i, j-1);
		return 1;
	}

}
