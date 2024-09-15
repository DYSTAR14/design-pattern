package design_pattern.dp.solid.dependency_inversion_principle.we_do;

import design_pattern.dp.solid.dependency_inversion_principle.KeyBoard;
import design_pattern.dp.solid.dependency_inversion_principle.Mouse;

public class MacBook {
	private final KeyBoard keyboard;
	private final Mouse mouse;
	
	MacBook(KeyBoard keyboard, Mouse mouse){
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

}
