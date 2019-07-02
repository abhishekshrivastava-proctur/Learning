package com.proctur.uservehicle.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.proctur.uservehicle.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer>, Serializable {

}
