// ROTATE 2D-MATRIX BY 90 degrees
//This code rotates the given 2D matrix by 90 degrees to the right.

class RotateMatrixBy90 {

	public void rotateRight (int[][] matrix) {

		//All squares considered one by one
		for (int  i=0; i<N/2; i++) {
			//Elements in the group of 4 in the current square
			for (int j=0; j<N-i-1; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][N-i-1];
				matrix[j][N-i-1] = matrix[N-i-1][N-j-1];
				matrix[N-i-1][N-j-1] = matrix[N-j-1][i];
				matrix[N-j-1][i] = temp;
			}
		}
	}

	public void displayMatrix (int[][] matrix) {

		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.println(matrix[i][j]);
		}
		System.out.println("");

	}

	//driver program
	public static void main (String []args) {


        int[] arr = { {1, 2, 3, 4},
        			{5, 6, 7, 8},
        			{9, 10, 11, 12},
        			{13, 14, 15, 16} };

        displayMatrix(arr);
        rotateRight(arr);
        displayMatrix(arr);
	}
}