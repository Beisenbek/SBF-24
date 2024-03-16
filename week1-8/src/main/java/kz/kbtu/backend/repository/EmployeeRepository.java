package kz.kbtu.backend.repository;

import kz.kbtu.backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {}