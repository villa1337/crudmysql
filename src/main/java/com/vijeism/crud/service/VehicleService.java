package com.vijeism.crud.service;

import com.vijeism.crud.model.Vehicle;
import com.vijeism.crud.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> listAll(){
        return vehicleRepository.findAll();
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
