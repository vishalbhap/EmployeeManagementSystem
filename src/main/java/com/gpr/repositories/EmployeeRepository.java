package com.gpr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gpr.models.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}