package com.vijeism.crud.service;

import com.vijeism.crud.model.Employee;
import com.vijeism.crud.model.EmployeeRequest;
import com.vijeism.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> listAll(){
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(Long.valueOf(id)).orElse(null);
    }

    public ResponseEntity<Employee> addEMployee(@Valid EmployeeRequest employee) {
        Employee employee1 = Employee.build(0l,employee.getName(),employee.getAge(),employee.getSalary(),employee.getVehicleList());
        return new ResponseEntity(employeeRepository.save(employee1), HttpStatus.OK);
    }
}
