package pr3.delivery.service;

import java.util.List;

import pr3.delivery.model.Vehicle;

public class DeliveryService {
	public void printAllVehicles(List<Vehicle> vehicles) {
		if (vehicles == null || vehicles.isEmpty()) {
		    return;
		}
		for(Vehicle v: vehicles) {
			v.getVehicleInfo();
		}
	}
	
	public void calculateAllDeliveries(List<Vehicle> vehicles) {
		if (vehicles == null || vehicles.isEmpty()) {
		    return;
		}
		for(Vehicle v: vehicles) {
			System.out.println(v.getModel() + ": " + v.calculateDeliveryCost());
		}
	}
	
	public double calculateTotalCost(List<Vehicle> vehicles) {
		if (vehicles == null || vehicles.isEmpty()) {
		    return 0.0;
		}
		double totalCost = 0.0;
		for(Vehicle v: vehicles) {
			totalCost += v.calculateDeliveryCost();
		}
		return totalCost;
	}
}
