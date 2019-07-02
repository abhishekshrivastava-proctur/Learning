package com.proctur.uservehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proctur.uservehicle.model.Vehicle;
import com.proctur.uservehicle.service.VehicleService;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping
	public List<Vehicle> getAllVehicle() {
		return vehicleService.getAllVehicle();
	}
	
	@GetMapping(value = "/{id}")
	public Vehicle getVehicle(@PathVariable int id) {
		return vehicleService.getVehicle(id);
	}
	
	@PostMapping
	public String addVehicle(Vehicle vehicle) {
		vehicleService.addVehicle(vehicle);
		return "Added Sucessfully";
	}
	
	@PutMapping(value = "/{id}")
	public String updateVehicle(@PathVariable int id, Vehicle vehicle) {
		vehicleService.updateVehicle(vehicle, id);
		return "Updated Sucessfully";
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteVehicle(@PathVariable int id) {
		vehicleService.deleteVehicle(id);
		return "Deleted Sucessfully";
	}
}
