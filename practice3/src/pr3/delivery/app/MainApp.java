package pr3.delivery.app;

import java.util.ArrayList;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

public class MainApp {
	public static void main(String[] args){
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		Engine engine1 = new Engine("Type1", 100);
		Engine engine2 = new Engine("Type2", 150);
		
		Car car1 = new Car("Car1", 5000, engine1, 5);
		Truck truck1 = new Truck("Truck1", 6000, engine2, 5);
		
		vehicles.add(truck1);
		vehicles.add(car1);
		
		DeliveryService service = new DeliveryService();
		
		service.printAllVehicles(vehicles);
		service.calculateAllDeliveries(vehicles);
		System.out.println("total_cost: " + service.calculateTotalCost(vehicles));
	}	
}
