package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByNullValueDemo3 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Raja", null, "mohan", null, "sohan");

		List<String> nullValues = new ArrayList<>();
		
		//list add in Stream ,filter by null and filter data collect and add another list
		nullValues = words.stream().filter(word ->word != null).collect(Collectors.toList());
		System.out.println("Filter Data add in another list : "+nullValues);
		
		System.out.println("=======Direct filter kiya data ko Print kra diya ===========");
		words.stream().filter(word -> word!=null).forEach(word -> System.out.println(word));
		
		System.out.println("=======Direct filter kiya data ko Print kra diya or forEach method se lamda expression remove kr diya ===========");
		words.stream().filter(word -> word!=null).forEach(System.out::println);
	}
}
