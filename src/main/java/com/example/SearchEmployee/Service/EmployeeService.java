package com.example.SearchEmployee.Service;

import com.example.SearchEmployee.domain.Employee;
import com.example.SearchEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }



    public Employee get(long id) {
        return repo.findById(id).get();
    }

}