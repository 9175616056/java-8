package extra;

final public class immutable {

	private final int id;
	private final String name;
	public immutable(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		immutable m=new immutable(11,"rohan");
		System.out.println(m);
	}
	
	
}
