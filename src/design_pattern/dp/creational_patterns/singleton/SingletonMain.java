package design_pattern.dp.creational_patterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		System.out.println("Hello");
//		System.out.println(Test.getTestInstance());
//		System.out.println(Test.getTestInstance());

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Test.getTestInstance());
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Test.getTestInstance());
			}
		});
		
		t1.start();
		t2.start();
		
		Testenum obj1 = Testenum.INSTANCE;
		obj1.setValue(6);;
		obj1.show();
		System.out.println(Testenum.INSTANCE);
		System.out.println(Testenum.INSTANCE);
		Testenum obj2 = Testenum.INSTANCE;
		obj2.setValue(7);;
		obj1.show();
	}

}
