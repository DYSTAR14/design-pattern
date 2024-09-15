package design_pattern.dp.behavioral_patterns.strategy_dp.with;

import design_pattern.dp.behavioral_patterns.strategy_dp.with.strategy.DriveStrategy;

public class Vehicle {
	
	DriveStrategy driveStrategy;
	
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}

}
