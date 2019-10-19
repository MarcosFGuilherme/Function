package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		showProduct(list);
			
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Function<Product, String> upperName = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(upperName).collect(Collectors.toList());
		
		List<String> names = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		showNames(names);
		
	}

	public static void showProduct(List<Product> list) {
		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		list.forEach(System.out::println);
		System.out.println();
	}
	
	public static void showNames(List<String> list) {
		list.sort((p1, p2) -> p1.compareTo(p2));
		list.forEach(System.out::println);
		System.out.println();
	}
}
