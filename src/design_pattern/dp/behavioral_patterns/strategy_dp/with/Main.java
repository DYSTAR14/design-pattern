package design_pattern.dp.behavioral_patterns.strategy_dp.with;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new SportsVehicle();
		vehicle.drive();
		
		Vehicle vehicle1 = new GoodsVehicle();
		vehicle1.drive();
	}

}
