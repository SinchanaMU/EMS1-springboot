package com.example.EMS2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EMS2.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
