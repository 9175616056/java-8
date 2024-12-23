package Java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class whosalaryisthousand {

	public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 100));
        employees.add(new Employee("Bob", 111));
        employees.add(new Employee("Charlie", 120));

        // Find the employee with salary 111
        Optional<Employee> foundEmployee = employees.stream()
                .filter(emp -> emp.getSalary() == 111)
                .findFirst();

        // Print the result
        if (foundEmployee.isPresent()) {
            System.out.println("Employee found: " + foundEmployee.get().getName() + ", Salary: " + foundEmployee.get().getSalary());
        } else {
            System.out.println("No employee found with salary 111.");
        }
    }
}
//In this version, we use the stream() method to convert the list of employees into a stream.
//Then, we use the filter() method to filter the stream based on the condition that the salary is equal to 111.
//Finally, we use the findFirst() method to get the first employee that satisfies the condition. If such an employee exists, we print its details; otherwise, we print a message indicating that no employee was found with the specified salary.
//		
//	