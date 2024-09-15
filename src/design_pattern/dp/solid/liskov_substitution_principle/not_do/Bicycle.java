package design_pattern.dp.solid.liskov_substitution_principle.not_do;

public class Bicycle extends Vehicle {
	
	// Bicycle error will through
	public Boolean hasEngine() {
		return null;
	}

}
