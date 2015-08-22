import java.io.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.*;

@ManagedBean
@SessionScoped
public class helloBean implements Serializable {
	
	String name;
	String address;
	String beanName="hello bean viresh";
	hiBean hibean ;
	String named = "vireshdevthakur";
	/*ArrayList<UnitedStatesList> usalist = new ArrayList<UnitedStatesList>();*/
	
	/*public ArrayList<UnitedStatesList> getUsalist() {
		UnitedStatesList ulist = new UnitedStatesList();
		ulist.setFlag("tricolor");
		ulist.setName("India");
		ulist.setTimeZone("IST");
		ulist.setState("Maharashtra");
		usalist.add(ulist);
		return usalist;
	}

	public void setUsalist(ArrayList<UnitedStatesList> usalist) {
		this.usalist = usalist;
	}*/

	public String getNamed() {
		return named;
	}

	public void setNamed(String named) {
		this.named = named;
	}

	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public ArrayList<Employee> employees = new ArrayList<Employee>();
			
	public ArrayList<Employee> getEmployees() {
		Employee emp = new Employee();
		emp.setAge("26");
		emp.setDepartment("it");
		emp.setName("viresh dev");
		emp.setSalary("5500");
		employees.add(emp);
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public hiBean getHibean() {
		return new hiBean();
	}

	public void setHibean(hiBean hibean) {
		this.hibean = hibean;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
