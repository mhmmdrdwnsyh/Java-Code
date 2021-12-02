public class kecepatanCahaya {
	public static void main(String[] args) {
	int kecepatan;
	long hari,detik,jarak;
	
	kecepatan = 300000;
	hari = 100;
	
	detik = hari * 24 * 60 * 60;
	jarak = kecepatan * detik;
	
	System.out.print("Dalam " + hari);
	System.out.print(" hari, cahaya merambat sejauh " );
	System.out.println(jarak + "kilometer");
	
	}
}
