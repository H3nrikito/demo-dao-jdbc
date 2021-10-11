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
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj); 
		}
				
		System.out.println("\n=== TEST 3: Department insert ===");
		Department dep = new Department(null, "Gamers");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
				
		System.out.println("\n=== TEST 4: Department update ===");
		department = departmentDao.findById(5);
		department.setName("DepF");
		departmentDao.update(department);
		System.out.println("Update completed!");
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: Department delete ===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
				
		sc.close();
	}
}
