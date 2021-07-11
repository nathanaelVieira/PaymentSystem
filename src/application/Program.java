package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoucedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; ++i) {
			sc.nextLine();
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char choose = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerhours = sc.nextDouble();
			
			if( choose == 'y' ) {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				Employee emp = new OutsoucedEmployee(name, hours, valuePerhours, additionalCharge);
				list.add(emp);
			} else if( choose == 'n') {
				list.add(new Employee(name, hours, valuePerhours));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp :  list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
	}

}
