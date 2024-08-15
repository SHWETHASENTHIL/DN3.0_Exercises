package service;

import model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
   
    Page<Department> getDepartments(Pageable pageable);

    Optional<Department> findDepartmentById(Long id);
    
    Department saveDepartment(Department department);

    void deleteDepartment(Long id);

    List<Department> findAllDepartments();
}


