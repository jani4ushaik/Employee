package ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ashokit.Entity.Employee;
import ashokit.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/create")
	public String createemployee(@RequestBody Employee employee) {

		boolean em = employeeService.createEmployee(employee);
		if (em) {
			return "Employee add";
		} else {
			return "Employee not add";
		}
	}

	@PutMapping("/update/{id}")
	public String updateemployee(@PathVariable Long id, @RequestBody Employee employee) {
		boolean updateEmployee = employeeService.updateEmployee(id, employee);
		if (updateEmployee) {
			return "update employee";
		} else {
			return "not update employee";
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deletempolyee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}

	@GetMapping("/getallemp")
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = employeeService.getAllEmployee();
		return allEmployee;
	}

}
