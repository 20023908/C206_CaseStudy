/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20016936 Daniel Ko, 31 Jul 2021 1:25:32 pm
 */

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
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
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
