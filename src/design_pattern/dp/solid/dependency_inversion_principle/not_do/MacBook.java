package design_pattern.dp.solid.dependency_inversion_principle.not_do;

import design_pattern.dp.solid.dependency_inversion_principle.WiredKeyboard;
import design_pattern.dp.solid.dependency_inversion_principle.WiredMouse;

public class MacBook {
	private final WiredKeyboard keyboard;
	private final WiredMouse mouse;
	
	MacBook(){
		keyboard = new WiredKeyboard();
		mouse = new WiredMouse();
	}

}
