public class TestBike {
	public static void main(String[] args) {
		Bicycle bike1, bike2, bike3;
		
		bike1 = new Bicycle(20,1);
		bike2 = new Mountainbike(20,2,"Dual");
		bike3 = new Roadbike(40,3,23);
		
		bike1.printDesc();
		bike2.printDesc();
		bike3.printDesc();
	}
}
