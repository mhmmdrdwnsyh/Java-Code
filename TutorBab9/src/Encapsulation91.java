public class Encapsulation91 {
	private int nilaiSaya;
	
	protected String nama;
	protected String NPM;
	
	
	public void setNilai(int nilai) {
		nilaiSaya = nilai;
		if(nilai>=100) {
			System.out.println("Nilai tidak boleh lebih dari 100");
		}
	}
	
	public int getNilai(){
		return nilaiSaya;
	}
}
