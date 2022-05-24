package synchronization.Multithreading;

public class Test {

	public static void main(String[] args) {
		
		Hello h = new Hello();
		A t1 = new A(h, "Java");
		A t2 = new A(h, "Class");
		
		  t1.start();
		  t2.start();
		Hello h1 = new Hello();
		 A t3 = new A(h1, "Cjc");
		 A t4 = new A(h1, "Pune");
		 
		  t3.start();
		  t4.start();
		 

	}

}
