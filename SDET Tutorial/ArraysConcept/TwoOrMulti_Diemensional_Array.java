package ArraysConcept;

public class TwoOrMulti_Diemensional_Array {

	public static void main(String[] args) {

//		int a[][] = new int[3][2]; // decalare 2-D array with size [row][column]
//		// 1st row
//		a[0][0] = 10;
//		a[0][1] = 20;
//
//		// 2nd row
//		a[1][0] = 30;
//		a[1][1] = 40;
//		// 3rd row
//		a[2][0] = 50;
//		a[2][1] = 60;

		// decalare 2-D array without size
		int a[][] = { {10,20},{30,40},{50,60} ,{70,80} };

		System.out.println("Number of rows " + a.length); // 3
		System.out.println("Number of colums " + a[0].length); // zero 0 row par kitne colums hai vo aljer dega

		System.out.println("==========Read values using for loop==========");
		// outer loop iterate for rows
		for (int i = 0; i < a.length; i++) {

			// outer loop iterate for colums
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		System.out.println("==========Read values using Enhance for loop==========");
		// Outer Enhance for loop, 2-D array me se ek puri Row leta or "r[]" me store karta h ese

		for (int r[] : a) { // first time ->{10,20} ,Second time ->{20,30},Third time ->{40,50}

			// inner Enhance for loop jese 1-D array ke liy work karta h vese hi work karta hai
			for (int i : r) {
				System.out.println(i); // first time ->10,20 Second time ->30,40 Third time -> 50,60
			}
		}
	}

}
