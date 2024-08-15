package service;

import model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAllEmployees();
    
    Optional<Employee> findEmployeeById(Long id);
    
    Employee saveEmployee(Employee employee);
    
    void deleteEmployee(Long id);
    
    Page<Employee> getEmployees(Pageable pageable);
    
    void saveEmployeesInBatch(List<Employee> employees);
}



