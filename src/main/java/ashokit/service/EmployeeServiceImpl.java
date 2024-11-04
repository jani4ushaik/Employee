package ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashokit.Entity.Employee;
import ashokit.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public boolean createEmployee(Employee employee) {
		Employee emp = new Employee();
		emp.setName(employee.getName());
		emp.setMobileno(employee.getMobileno());
		emp.setAddrees(employee.getAddrees());
		emp.setEmail(employee.getEmail());
		emprepo.save(emp);
		return true;
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		Employee emp = new Employee();
		emp.setName(employee.getName());
		emp.setMobileno(employee.getMobileno());
		emp.setAddrees(employee.getAddrees());
		emp.setEmail(employee.getEmail());
		emprepo.save(emp);
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> all = emprepo.findAll();
		return all;
	}

	@Override
	public boolean updateEmployee(Long id, Employee employee) {
		Optional<Employee> empid = emprepo.findById(id);
		
		Employee emp=new Employee();
		emp.setName(employee.getName());
		emp.setAddrees(employee.getAddrees());
		emp.setMobileno(employee.getMobileno());
		emp.setEmail(employee.getEmail());
		emprepo.save(emp);
		return true;
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employee> byId = emprepo.findById(id);
		if(byId.isPresent()) {
			emprepo.delete(byId.get());
		}else {
			System.out.println("not found reord");
		}
		
	}

	
	}


