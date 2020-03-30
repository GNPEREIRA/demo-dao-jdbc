package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Department obj = new Department(1, "Books");
		
		System.out.println(obj);
		
		Seller obj1 = new Seller(1,"Gustavo", "gustavo@gmail.com", sdf.parse("24/03/1983"), 2000.0, obj);
		
		System.out.println(obj1);

	}

}
