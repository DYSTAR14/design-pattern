package design_pattern.dp.solid.liskov_substitution_principle.we_do;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new MotorCycle());
		vehicles.add(new Car());
		vehicles.add(new Bicycle());
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getNumerOfWheels().toString());
		}
		
		//Now compile time error will come
		//You can not access hasEngine() Method from Vehicle class 
//		for(Vehicle vehicle : vehicles) {
//			System.out.println(vehicle.hasEngine().toString());
//		}
		
		
		List<EngineVehicle> engineVehicles = new ArrayList<>();
		engineVehicles.add(new MotorCycle());
		engineVehicles.add(new Car());
		//Now compile time error will come
		//You can't add Bicycle Object in EngineVehicle class
//		engineVehicles.add(new Bicycle());
		
		for(EngineVehicle engineVehicle : engineVehicles) {
			System.out.println(engineVehicle.hasEngine().toString());
		}

	}

}
