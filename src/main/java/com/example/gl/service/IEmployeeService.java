package com.example.gl.service;

import com.example.gl.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public void deleteEmployeeById(Long id);
}
