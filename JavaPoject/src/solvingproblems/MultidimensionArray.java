package solvingproblems;
public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {1, 12, 54};
		
		System.out.println(values[2]);
											//Multidimensional matrix
		int[] [] grid = {
				{22, 44, 66},
				{5, 10},
				{1, 2, 3, 4}
		};
		System.out.println(grid[0] [2]);
		System.out.println(grid[2] [3]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);		//here we are printing array of integer by using for iteration
		
		for(int row = 0; row<grid.length; row++) {
			for(int col = 0; col<grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}
			System.out.println();
		}
		String[][] words = new String[2][];				//here we are printing array of string
		
		System.out.println(words[0]);
		
		words[0] = new String[3];
		
		words[0][1] = "hi there";
		
		System.out.println(words[0][1]);
	}

}
