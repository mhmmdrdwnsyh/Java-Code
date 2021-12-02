class Karyawan {
	String nama,NIP;
    //[1] deklarasikan variable nama dan NIP
    
   //[2] membuat constructor dengan memiliki parameter String inputNama dan String inputNIP
	Karyawan(String inputNama,String inputNIP){
        nama = inputNama;
        NIP = inputNIP;

        System.out.println("Nama Karyawan = " + nama);
        System.out.println("NIP = " + NIP);
        System.out.println(" ");
    }
}

public class act1 {
	public static void main(String[] args) {
		Karyawan data1 = new Karyawan("Ani Lestari", "51420202");
		Karyawan data2 = new Karyawan("Dimas", "53420299");
		Karyawan data3 = new Karyawan("Bayu", "51429970");
		
	}
}
