
public class Employee {
	
	private Integer id;
	private String name;
	private String emailId;
	
	public Employee(Integer id, String name, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}
	
}
