package problem4.util;

import java.util.Comparator;

import problem4.model.Employee;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
