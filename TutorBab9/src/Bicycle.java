
public class Bicycle {

	int kecepatan = 0;
	int gigi = 1;
	
	public Bicycle(int kecepatan, int gigi) {
		this.kecepatan = kecepatan;
		this.gigi = gigi;
	}
	
	
	public void printDesc(){
		System.out.println("\n Sepeda ini " + "pada gigi " + this.gigi + " dan berjalan dengan kecepatan " + this.kecepatan);
	}
}
