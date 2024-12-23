
public class comparators {

	private String name;
	private String phone;
	private int empid;
	public comparators(String name, String phone, int empid) {
		super();
		this.name = name;
		this.phone = phone;
		this.empid = empid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return "comparators [name=" + name + ","
				+ " phone=" + phone + ","
						+ " empid=" + empid + "]";
	}
}
