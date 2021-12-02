public class Roadbike extends Bicycle {
	
	public Roadbike(int mulaiKecepatan, int mulaiGigi, int lebarRodaBaru){
		super(mulaiKecepatan, mulaiGigi);
		this.setLebarRoda(lebarRodaBaru);
	}
	
	public int getLebarRoda() {
		return lebarRoda;
	}

	public void setLebarRoda(int lebarRodaBaru) {
		this.lebarRoda = lebarRoda;
	}
	
	private int lebarRoda;
	
	@Override
	public void printDesc() {
		super.printDesc();
		System.out.println("Roadbike ini " + " memiliki " + getLebarRoda() + " MM roda");
	}
	
}
