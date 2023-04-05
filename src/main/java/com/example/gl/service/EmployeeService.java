package com.example.gl.service;



import com.example.gl.domain.Employee;
import com.example.gl.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        // TODO Auto-generated method stub

    }

    @Override
    public Employee getEmployee(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        // TODO Auto-generated method stub

    }
}

