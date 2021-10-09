package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); //injeção de dependencia
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		//System.out.println("\n=== TEST 2: Department findById ===");
		
		
		//System.out.println("\n=== TEST 3: Department findAll ===");
		
		
		//System.out.println("\n=== TEST 4: Department insert ===");
		
		
		//System.out.println("\n=== TEST 5: Department update ===");
		
		
		//System.out.println("\n=== TEST 6: Department delete ===");
		
		//System.out.println("Delete completed!");
		
		
		sc.close();
	}
}
