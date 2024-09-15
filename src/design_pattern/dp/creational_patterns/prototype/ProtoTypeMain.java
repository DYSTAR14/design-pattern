package design_pattern.dp.creational_patterns.prototype;

public class ProtoTypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		//ProtoType mean cloning complete object into different object
		
		//ShallowClone refer to same object
		BookShop_ShallowClone b1 = new BookShop_ShallowClone();
		b1.setName("first");
		b1.loadData();
		System.out.println(b1.toString());
		
		BookShop_ShallowClone b2 = (BookShop_ShallowClone) b1.clone();
		b1.getBooks().remove(3);
		System.out.println(b2.toString());
		b2.setName("Second");
		System.out.println(b2.toString());
		
		System.out.println();
		System.out.println();
		
		//DeepClone create new Object
		BookShop_DeepClone b3 = new BookShop_DeepClone();
		b3.setName("third");
		b3.loadData();
		System.out.println(b3.toString());
		
		BookShop_DeepClone b4 = b3.clone();
		b3.getBooks().remove(3);
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		b4.setName("forth");
		System.out.println(b4.toString());
		
		System.out.println();
		System.out.println();
		
		
	}

}
