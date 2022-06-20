package FilterDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int modelNumber;
	String name;
	int price;
	public Product(int modelNumber, String name, int price) {
		
		this.modelNumber = modelNumber;
		this.name = name;
		this.price = price;
		
		
	}
	@Override
	public String toString() {
		return "Product [modelNumber=" + modelNumber + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

public class FilterByObject {

	public static void main(String[] args) {
		List <Product> productList =new  ArrayList<>();
		 productList.add(new Product (101,"Dell",25000));
		 productList.add(new Product (102,"Hp",35000));
		 productList.add(new Product (103,"Lenova",20000));
		 productList.add(new Product (104,"Asus",27000));
		 productList.add(new Product (105,"DellPro",30000));
		 
		 
		//list add in Stream ,filter by price and filter data collect and add another list 
		List<Product> newproductList= productList.stream().filter(product ->product.price>25000).collect(Collectors.toList());
		System.out.println(newproductList);
		
		System.out.println("=======Direct filter kiya data ko Print kra diya ===========");
		productList.stream().filter(product ->product.price>25000).forEach(product ->System.out.println(product));
		
	
		System.out.println("=======Direct filter kiya data ko Print kra diya or forEach method se lamda expression remove kr diya ===========");
		productList.stream().filter(product ->product.modelNumber>25000).forEach(System.out::println);
		
		System.out.println("=========Filter by ModelNumber======");
		productList.stream().filter(product -> product.modelNumber>102).forEach(System.out :: println);
		
		System.out.println("=========Filter by Name ======");
	productList.stream().filter(product -> product.name.startsWith("D")).forEach(System.out ::println);
	
		
	}

}
