// Team Something - Sean Roudnitsky, Derek Song, Shruthi Venkata
// APCS2 pd8
// HW#05 - But What Does the Data Say?
// 2018-02-07

public class MatrixFinder {
  
    public static String finder( int[][] array, int target) {
		int row = array.length-1;
		int col = 0;
		while (col < array[0].length && row >= 0) {
			if (target == array[row][col])
				return "(" + row + ", " + col + ")";
			else if (target < array[row][col]) 
				row-=1;
			else
				col+=1;
		}
		return "(-1, -1)";
	}
    

    public static void main ( String[] args ) {
	
	int[][] arr1 =
	    {
		{1, 2, 3, 4},
		{2, 3, 4, 5},
		{3, 4, 5, 6},
		{7, 8, 9, 10}
	    };
	
	System.out.println(finder(arr1, 9)); // Should be 3,2
	
	int[][] arr2 =
	    {
		{1, 3, 5},
		{3, 7, 8},
		{5, 12, 15}
	    };
	
	System.out.println(finder(arr2, 12)); // Should be 2,1
	
	int[][] arr3 =
	    {
		{1, 2, 6},
		{2, 3, 7},
		{3, 4, 8}
	    };
	
	System.out.println(finder(arr3, 999)); // Should be -1,-1
	
	int[][] arr4 =
	    {
		{3,4,7,12,21},
		{4,6,12,40,53},
		{9,10,21,41,64},
		{12,14,34,42,80},
		{17,20,35,43,90}
	    };
	
	System.out.println(finder(arr4, 4)); // Should be 1, 0
	System.out.println(finder(arr4, 9)); // Should be 2, 0
    }
}