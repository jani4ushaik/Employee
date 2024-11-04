package ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ashokit.Entity.Employee;

@Service
public interface EmployeeService {
	
	public boolean createEmployee(Employee employee);
	
	public boolean saveEmployee(Employee employee);
	
	public List<Employee>getAllEmployee();
	
	public boolean updateEmployee(Long id,Employee employee);
	
	public void deleteEmployee(Long id);

}
