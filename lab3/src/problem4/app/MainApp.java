package problem4.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import problem4.model.Employee;
import problem4.model.Manager;
import problem4.util.SortByName;

public class MainApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ali", 500000, "8943");
        Employee e2 = new Employee("Ayau", 600000, "292");
        Employee e3 = new Employee("Ayau", 600000, "292");
        
        Manager m1 = new Manager("Assel", 800000, "001", 50000);
        Manager m2 = new Manager("Dana", 700000, "002", 70000);
        
        m1.addTeam(e2);
        m2.addTeam(e1);
        
        System.out.print(e1.equals(e2));
        System.out.println();
        System.out.print(e2.equals(e3));
        System.out.println();
        
        List<Employee> staff = new ArrayList<>(Arrays.asList(e1, e2, m1, m2));
        Collections.sort(staff);
        for(Employee e : staff) {
        	System.out.println(e);
        }
        System.out.println();
        
        SortByName sbn = new SortByName();
        staff.sort(sbn);
        for(Employee e : staff) {
        	System.out.println(e);
        }
	}

}
