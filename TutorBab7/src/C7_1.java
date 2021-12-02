class Datakaryawan {
	String namaKaryawan;
	String NIP;
	int umur;
	
	Datakaryawan(){ 
		this.namaKaryawan =  "Andi";
		this.NIP = "1234";
		this.umur = 21;

	}
	void cetakData() {
		System.out.println("Nama Karyawan = " + namaKaryawan);
		System.out.println("NIP = " + NIP);
		System.out.println("umur = " + umur);
		
	}
}

public class C7_1 {
	public static void main(String[] agrs) {
		Datakaryawan data1 = new Datakaryawan();
		data1.cetakData();
	}
}
