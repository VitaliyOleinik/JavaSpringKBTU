package com.example.spring_boot_rest1.repository;

import com.example.spring_boot_rest1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
