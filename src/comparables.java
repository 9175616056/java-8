
public class comparables implements Comparable<comparables> {

	private String name;
	private String phone;
	private int empid;
	public comparables(String name, String phone, int empid) {
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
		return "comparables [name=" + name + ","
				+ " phone=" + phone + ","
						+ " empid=" + empid + "]";
	}

	@Override
	public int compareTo(comparables o) {
		
		return this.empid-o.empid;
	}
	
	
}
