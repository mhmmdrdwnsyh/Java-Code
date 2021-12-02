
public class testnilai {
	public static void main(String[] args) {
		Encapsulation91 biodata = new Encapsulation91();
		
		biodata.nama = "Putri";
		biodata.NPM = "12345678";
		biodata.setNilai(99);
		
		System.out.println("Nama: " + biodata.nama);
		System.out.println("NPM: " + biodata.NPM);
		System.out.println("Nilai: " + biodata.getNilai());
		
	}
}
