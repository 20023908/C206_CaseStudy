
public class account {
	
	private String name;
	private String role;
	private String email;
	private String password;
	
	public account(String name, String role, String email, String password) {
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void viewDetails() {
		System.out.println("Name: " + name);
		System.out.println("Role: " + role);
		System.out.println("Email: " + email);
	}
	
}
