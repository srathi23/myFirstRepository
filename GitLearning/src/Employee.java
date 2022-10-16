
public class Employee {
	
	private Integer id;
	private String name;
	private String emailId;
	private Address address;
	
	public Employee(Integer id, String name, String emailId, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + ", address=" + address + "]";
	}
	
}
