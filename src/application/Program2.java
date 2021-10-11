package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); //injeção de dependencia
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(2);
		
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: Department findAll ===");
		
		//List<Seller> list = sellerDao.findByDepartment(department);
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj); 
		}
				
		System.out.println("\n=== TEST 3: Department insert ===");
		Department dep = new Department(null, "Gamers");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
				
		//System.out.println("\n=== TEST 5: Department update ===");
		
		
		//System.out.println("\n=== TEST 6: Department delete ===");
		
		//System.out.println("Delete completed!");
		
		
		sc.close();
	}
}
