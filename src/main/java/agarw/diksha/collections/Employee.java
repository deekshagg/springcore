package agarw.diksha.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> mobile;
	private Set<String> address;
	private Map<String, String> courses;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + ", address=" + address + ", courses=" + courses + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> mobile, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
}
