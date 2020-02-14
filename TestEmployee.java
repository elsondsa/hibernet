package comjdbc;

import org.junit.Test;


public class TestEmployee {

	@Test
	public void test() {
		EmployeeName ename=new EmployeeName();
		ename.setFname("Ramachandra");
		ename.setLname("Guha");
		ename.setMname("Reddy");
		
		Employee emp = new Employee();
		emp.setName(ename);
		emp.setSalary(10000);
		EmployeeRepo repo = new EmployeeRepo();
		repo.addEmployee(emp);
		//emp=repo.fetchEmployee(emp, 1);
		//System.out.println(emp);
	}

}
