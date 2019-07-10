package com.sujitmo.springdemo.repository;



import com.sujitmo.springdemo.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepo {

    List<Employee> getEmployees();

    Employee getEmployee(Integer id);

    String saveEmployee(Employee employee);

    String updateEmployee(Integer id,String name);


    List<Map<String,Object>> getCombinedData();
}