public class Mountainbike extends Bicycle {
	
	public Mountainbike(int mulaiKecepatan, int mulaiGigi, String suspension) {
		super(mulaiKecepatan, mulaiGigi);
		this.setSuspension(suspension);
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	
	private String suspension;

	@Override
	public void printDesc(){
		super.printDesc();
		System.out.println("Mountain Bike ini memiliki " + getSuspension() + " suspension");
	}
}
