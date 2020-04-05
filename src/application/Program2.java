package application;

import java.util.List;
import java.util.Scanner;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("**** Teste 1 - FindById Department ****");
		Department department = depDao.findById(2);
		System.out.println(department);*/
		
		/*System.out.println("**** Teste 2 - Insert Department ****");
		Department obj = new Department(null, "Kichen");
		depDao.insert(obj);
		System.out.println("Inserido com Sucesso");*/
		
		/*System.out.println("**** Teste 3 - Update Department ****");
		Department obj = depDao.findById(5);
		obj.setName("Kitchen");
		depDao.update(obj);
		System.out.println("Atualizado com Sucesso");*/
		
		/*System.out.println("**** Teste 4 - Delete Department ****");
		System.out.print("Informe o Id: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Id #"+id+" excluído com sucesso");*/
		
		System.out.println("**** Teste 5 - FindAll Departments order by Name ****");
		List<Department> list = depDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		
		sc.close();
	}
	
	

}
