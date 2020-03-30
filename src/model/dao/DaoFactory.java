package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*Classe aux. terá oprações estáticas para instanciar os Daos*/
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
