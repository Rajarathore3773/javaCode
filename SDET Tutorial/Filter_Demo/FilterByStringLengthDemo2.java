package FilterDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByStringLengthDemo2 {

	public static void main(String[] args) {
		List <String> name =Arrays.asList("RajaRathore","Sachin","Pal","ViratYadav","Mohan");
		
		List<String> longName= new ArrayList<>();
		
		//list add in Stream ,filter by length "graterThan and LessThan" and filter data collect and add another list
		longName = name.stream().filter(str ->str.length()>=5 && str.length()<=8 ).collect(Collectors.toList());
		System.out.println("Collect data print :"+longName);
		
		//Direct print filter data without add another list
		name.stream().filter(str ->str.length()>=5 && str.length()<=8).forEach(str ->System.out.println("filter data Direct print :"+str));
	
		//Direct print filter data without add another list
		name.stream().filter(str ->str.length()>=5 && str.length()<=8).forEach(System.out :: println);
	}

}
