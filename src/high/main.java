package high;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "HR", 50000));
        employees.add(new Employee("Jane", "Finance", 60000));
        employees.add(new Employee("Doe", "IT", 55000));
        employees.add(new Employee("Alice", "Marketing", 62000));

        // Find the employee with the highest salary
        Employee highestPaidEmployee = findHighestPaidEmployee(employees);

        // Output the result
        if (highestPaidEmployee != null) {
//            System.out.println("The employee with the highest salary is " + highestPaidEmployee.getName() + 
//                               " from the " + highestPaidEmployee.getDepartment() + 
//                               " department, earning " + highestPaidEmployee.getSalary());
        	System.out.println( highestPaidEmployee.getName() +" :"+ 
                     highestPaidEmployee.getDepartment() + " :"+
                     highestPaidEmployee.getSalary());
        }
    }

    public static Employee findHighestPaidEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            return null; // return null if the list is empty
        }

        Employee highestPaidEmployee = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() > highestPaidEmployee.getSalary()) {
                highestPaidEmployee = employee;
            }
        }
        return highestPaidEmployee;
    }
}
