package ru.sberbark.employee.background.model;

public class Employee {
	private Integer id;
	private String passportNumber;
	private String email;
	private String phone;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String passportNumber, String email, String phone) {
		super();
		this.id = id;
		this.passportNumber = passportNumber;
		this.email = email;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "EmployeeBackground [id=" + id + ", passportNumber=" + passportNumber + ", email=" + email + ", phone="
				+ phone + "]";
	}
		
}