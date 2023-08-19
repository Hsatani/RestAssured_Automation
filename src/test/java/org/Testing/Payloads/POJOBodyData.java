package org.Testing.Payloads;

public class POJOBodyData {
	
	public String FirstName;
	public String LastName;
	public int age;
	public String Profession;
	public int Id;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	

}
