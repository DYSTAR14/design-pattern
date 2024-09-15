package design_pattern.dp.behavioral_patterns.strategy_dp.with;

import design_pattern.dp.behavioral_patterns.strategy_dp.with.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
		// TODO Auto-generated constructor stub
	}

}
