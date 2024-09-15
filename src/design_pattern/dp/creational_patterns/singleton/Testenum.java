package design_pattern.dp.creational_patterns.singleton;

public enum Testenum {
	INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void show() {
    	System.out.println(value);
    }
}
