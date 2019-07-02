package com.proctur.uservehicle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proctur.uservehicle.model.Vehicle;
import com.proctur.uservehicle.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	public List<Vehicle> getAllVehicle(){
		List<Vehicle> vehicles = new ArrayList<>();
		vehicleRepository.findAll()
		.forEach(vehicle -> vehicles.add(vehicle));
		return vehicles;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	public void deleteVehicle(int id) {
		vehicleRepository.deleteById(id);
	}
	
	public void updateVehicle(Vehicle vehicle, int id) {
		vehicleRepository.save(vehicle);
	}
	
	public Vehicle getVehicle(int id) {
		return vehicleRepository.findById(id).get();
	}
}
