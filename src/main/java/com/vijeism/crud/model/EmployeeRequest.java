package com.vijeism.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {

    private String name;
    private int age;
    private Long salary;
    private List<Vehicle> vehicleList;
}
