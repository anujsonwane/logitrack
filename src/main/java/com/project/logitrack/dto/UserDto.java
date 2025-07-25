package com.project.logitrack.dto;

public class UserDto {
	private String name;	
    private String email;
    private String password;
    private String phone;
	
    public UserDto() {
		// TODO Auto-generated constructor stub
	}
    
    public UserDto(String name, String email, String password, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
	}
    
    
    
    
    
    
}
