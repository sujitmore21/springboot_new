package com.sujitmo.springdemo.controller;


import com.sujitmo.springdemo.impl.EmployeeImpl;
import com.sujitmo.springdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeImpl employeeImpl;

    @GetMapping(value = "/getemployees")
    public List<Employee> getData() {
        List<Employee> list = employeeImpl.getEmployees();
        return list;
    }

    @GetMapping(value = "/getemployee/{id}")
    public Employee getData1(@PathVariable Integer id) {
        Employee emp = employeeImpl.getEmployee(id);
        return emp;
    }

    @PostMapping(value = "/saveemp")
    public String saveData(@RequestBody Employee employee) {
        String result = employeeImpl.saveEmployee(employee);
        return result;
    }

    @GetMapping(value = "/updateemp/{id}/{name}")
    public String updateData(@PathVariable Integer id,
                             @PathVariable String name) {
        String res = employeeImpl.updateEmployee(id, name);
        return res;
    }

    @GetMapping(value = "/joindata")
    public List<Map<String, Object>> getCombineddata() {
        return employeeImpl.getCombinedData();
    }
}