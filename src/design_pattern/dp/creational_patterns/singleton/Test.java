package design_pattern.dp.creational_patterns.singleton;

public class Test {
	
	static Test obj;
	
	private Test(){
		System.out.println("Instance created");
	};
	
	public static Test getTestInstance() {
		if (obj == null) {
			synchronized (Test.class) {
				if (obj == null) {
					obj = new Test();
				}
			}
		}
		return obj;
	}

}
