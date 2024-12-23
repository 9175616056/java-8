package high;

public class Employee {

	 String name;
	    String department;
	    double salary;
		public Employee(String name, String department, double salary) {
			super();
			this.name = name;
			this.department = department;
			this.salary = salary;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return the department
		 */
		public String getDepartment() {
			return department;
		}
		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}
	    
	    

//	    public Employee(String name, String department, double salary) {
//	        this.name = name;
//	        this.department = department;
//	        this.salary = salary;
//	    }
//
//	    public String getName() {
//	        return name;
//	    }
//
//	    public String getDepartment() {
//	        return department;
//	    }
//
//	    public double getSalary() {
//	        return salary;
//	    }
}
