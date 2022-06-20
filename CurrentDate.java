import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CurrentDate {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  Current Zone : ");
		String str=sc.nextLine();
//		System.out.println("Enter  current date");
//		int date = sc.nextInt();
//		
//		System.out.println("Enter  current Month");
//		String month = sc.next();
//		
//		System.out.println("Enter  current year");
//		int year=sc.nextInt();
//		
		//System.out.println("Date:" + date + ", "+"Month:" +month + ","+ "Year:" + year);
		
		//System.out.println(" Current zone:" + date + "-" +month + "-"+  + year);
		
		
		
		Date d= new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat(str);
	
		System.out.println(sdf.format(d));

	}

}
