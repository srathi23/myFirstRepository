
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello!");
		Address address = new Address("addressLine1", "addressLine2", "Pune", 123456);
		Employee employee = new Employee(1, "Ankit", "ankit@gmail.com", address);
		System.out.println(employee);
	}

}
