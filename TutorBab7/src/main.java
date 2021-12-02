class Mahasiswa {
	void cetakData() {
	System.out.println("Nama Mahasiswa = Andi");
	System.out.println("NPM = 51420202");
	System.out.println("Umur = 18 tahun ");
	}
}

public class main {
	public static void main(String[] args) {
	
	//[2] membuat objek baru dari class Mahasiswa yang diberi nama data1
    Mahasiswa data1 = new Mahasiswa();
	//[3] melakukan pemanggilan method cetakData yang mengacu pada objek data1 
	data1.cetakData();
	}
}
