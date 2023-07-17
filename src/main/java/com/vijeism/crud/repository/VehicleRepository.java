package com.vijeism.crud.repository;

import com.vijeism.crud.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
