package module3._6exercises;

public class E14CreateArray2 {
	
	//Exercise 14: Write code to declare and create a 
	//two-dimensional array of integers numbers with 
	//the numbers (1,2,3) in the first row, the numbers 
	//(4,5,6) in the second row, and the numbers (7,8,9) 
	//in the third row. Then loop through the 
	//two-dimensional array, printing out the values in 
	//the first row followed by those in the second row 
	//and so on.
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int row[]: arr){
			for(int col:row){
				System.out.print(col + ",");

			}
		}
    }
}

