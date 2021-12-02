public class DataMahasiswa2 {
	int nilai1 = 80;
	int nilai2 = 90;
	int jumlah;
	
	public static void main(String[] agrs){
		DataMahasiswa2 nilai = new DataMahasiswa2();
		System.out.println("jumlah nilai mahasiswa = " + nilai.jumlah());
	}
	
	int jumlah() {
		jumlah = (nilai1 + nilai2)/2;
		return jumlah;
		
		
	}
}
