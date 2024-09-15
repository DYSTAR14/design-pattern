package design_pattern.dp.behavioral_patterns.strategy_dp.with;

import design_pattern.dp.behavioral_patterns.strategy_dp.with.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDriveStrategy());
		// TODO Auto-generated constructor stub
	}
}
