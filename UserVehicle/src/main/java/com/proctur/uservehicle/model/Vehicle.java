package com.proctur.uservehicle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vehicle {
	/* 
	 * all variables
	 *  
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicleName;
	private String vehicleNumber;
	
	
	/* 
	 * generating all getter and setters 
	 * 
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	/* 
	 * generating parameterized and default constructors 
	 * 
	 */
	public Vehicle(int id, String vehicleName, String vehicleNumber) {
		super();
		this.id = id;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
	}
	public Vehicle() {
		super();
	}
	
}
