				package Java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class maxsalary {
	 public static void main(String[] args) {
	        // Sample list of employees
	        List<Employee> employees = Arrays.asList(
	                new Employee("John", 50000),
	                new Employee("Alice", 60000),
	                new Employee("Bob", 75000),
	                new Employee("Emma", 45000),
	                new Employee("Michael", 90000)
	        );

	        // Using Stream API to find employee with max salary
	        Optional<Employee> maxSalaryEmployee = employees.stream()
	                .max(Comparator.comparingInt(Employee::getSalary));

	        // Check if the result is present and print the name
	        maxSalaryEmployee.ifPresent(employee -> System.out.println("Employee with max salary: " + employee.getName()));
	    }
	}
// We use the Stream API to work with the list of employees.
//- The `max` operation is applied on the stream, which finds the maximum element according to the provided Comparator.
//- We use `Comparator.comparingInt(Employee::getSalary)` to compare employees based on their salary.

//```java
// Check if the result is present and print the name