package application;

import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("**** Teste 1 - FindById Seller ****");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
