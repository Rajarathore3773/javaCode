package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByEvenOddDemo1 {
	public static void main(String[] args) {
 /* ArrayList <Integer> numberList= new ArrayList<>(); // Step1
  
  numberList.add(10);   //Step 2
  numberList.add(20);
  numberList.add(30);
  numberList.add(40);
  */
		// In dono step ko ,ek hi class ke step me use kr sakte hai.using *Arrays.asList();*
		
		//Integer [] number = {10,20,30};
		List <Integer> numberList =Arrays.asList(10,15,20,25,30);
		
		//condition - The list is filter by evenNumber
		ArrayList<Integer> evenNumberList = new ArrayList<>();
		
		//Normal way filter the data without using Stream
		for(int n:numberList) {
			if(n%2==0) {
				evenNumberList.add(n);
			}
			
		}
		System.out.println("Normal way Filter data even number : "+evenNumberList);
		
		// add list in  Stream() and "filter data by condition" ,and add  collect filter date in Another List 
		List <Integer>	evenNumberList1 =numberList.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println("Normal way Filter data odd number : "+evenNumberList1);
		
		
		/*Filter kiye data ko --> Direct print karna using "forEach() -method", without add another list */
		//numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		// this is another way replacing Lamda expression in forEach()  method
		numberList.stream().filter(n->n%2==0).forEach(System.out ::println);
	}
}
