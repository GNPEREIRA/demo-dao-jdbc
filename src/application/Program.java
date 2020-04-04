package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("**** Teste 1 - FindById Seller ****");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("**** Teste 2 - FindByDepartement Seller ****");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("**** Teste 3 - FindAll ****");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("**** Teste 4 - insert ****");
		Seller newSeller = new Seller(null, "Gustavo", "gustavo@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido. #"+newSeller.getId());
		
		System.out.println("**** Teste 5 - Update Seller ****");
		seller = sellerDao.findById(1);
		seller.setName("Flavia Turrini");
		seller.setEmail("flavia.turrini@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update com sucesso.");
		
		System.out.println("**** Teste 6 - Delete Seller ****");
		System.out.print("Digite o Id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleção completa");
		sc.close();
	}

}
