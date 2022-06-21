package ArraysConcept;

public class Single_Diemensional_Array {

	public static void main(String[] args) {
		/*
		 * int a []= new int[5]; // decalare array with size 5, sartaung index is 0,last
		 * index is 4
		 * 
		 * //Storing / inserting values in array a[0]=10; a[1]=20; a[2]=30; a[3]=40;
		 * a[4]=50;
		 */
		int a[] = { 10, 20, 30, 40, 50 };// decalare an array without specify size
		System.out.println("Length of an array is " + a.length);

		System.out.println("read specific value" + a[2]);

		System.out.println("========== read values using for loop fist conditon-1=======");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]); // 10, 20,30,40,50
		}

		System.out.println("========== read values using for loop 2 conditon-2=======");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // 10, 20,30,40,50
		}
		System.out.println("========== read values using Enhance for loop=======");
		for (int i : a) {
			System.out.println(i); // 10, 20,30,40,50
		}
	}
}
