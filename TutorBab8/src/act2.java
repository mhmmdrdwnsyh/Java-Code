class Karyawan2 {
	//[1] deklarasikan variabel untuk menyimpan nilai namaKaryawan, NIP, umur;
	String namaKaryawan;
	String NIP;
	int umur;
	//[2] membuat constructor DataKaryawan yang memiliki parameter namaKaryawan, NIP, umur
    Karyawan2(String namaKaryawan, String NIP, int umur){
	this.namaKaryawan = namaKaryawan;
    this.NIP = NIP;
    this.umur = umur;
    
	}
//[3] membuat method tampilData dengan tipe tidak mengembalikan nilai
	void tampilData(){
    System.out.println("Nama Karyawan = " + namaKaryawan);
    System.out.println("NIP = " + NIP);
    System.out.println("umur = " + umur + " tahun");
	
	}
}
public class act2 {
	 public static void main(String[] args) {

		 //[4] membuat objek dari class DataKaryawan yang di beri nama data1 dimana memiliki constructor dengan parameter “Andi”,”999123”, 30.
		 Karyawan2 Data1 = new Karyawan2("wildan","1234",17);
		 //[5] melakukan pemanggilan method tampilData dengan mengacu ke objek data1      
		 Data1.tampilData();
	    }
}
