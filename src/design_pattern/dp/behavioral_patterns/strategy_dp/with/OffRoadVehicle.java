package design_pattern.dp.behavioral_patterns.strategy_dp.with;

import design_pattern.dp.behavioral_patterns.strategy_dp.with.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}
	
}
