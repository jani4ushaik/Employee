package ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ashokit.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
