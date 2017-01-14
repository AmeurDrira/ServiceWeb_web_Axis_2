package tn.iit.interfaces;

import java.util.Map;

import javax.ws.rs.core.Response;

import tn.iit.model.Employee;

public interface EmployeeService {
	/*public Response addEmployee(Employee e);
	public Response addEmploye(String e);

	public Response deleteEmployee(int id);

	public Employee getEmployee(int id);
*/
	public Map<Integer, Employee> getAllEmployees();

}
