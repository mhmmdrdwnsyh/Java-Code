class DataKaryawan{
	String nama,NIP;
	
	DataKaryawan(String inputNama, String inputNIP){
		nama = inputNama;
		NIP = inputNIP;
		
		System.out.println("Nama Karyawan = " + nama);
		System.out.println("NIP = " + NIP);
		System.out.println(" ");
		
	}
}

public class Main {
	public static void main(String[] args) {
		DataKaryawan data1 = new DataKaryawan("ani", "1234");
		DataKaryawan data2 = new DataKaryawan("andi", "5678");
	}
}
