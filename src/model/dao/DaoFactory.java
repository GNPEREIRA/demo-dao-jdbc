package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*Classe aux. ter� opra��es est�ticas para instanciar os Daos*/
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
