
public class Variabel {
	public static void main(String[] args) {
        String namaMhs ="Ani";
        String NPM ="51419999";

        System.out.println("Nama mahasiswa = " + namaMhs);
        System.out.println("NPM = " + NPM);
        
        namaMhs ="Budi";
        System.out.println("Nama mahasiswa saat ini = " + namaMhs);
        
      //final tipe_data nama_konstanta = nilai;
    	
    	final double PHI = 3.14;
    	double r,luas;
    	
    	r = 5.5;
    	luas = PHI * r * r;
    	
    	System.out.println("Luas lingkaran adalah " + luas);
    	
    	
    	//TIPE_DATA
    	/*Sederhana
    	 * -Primitive
    	 * bilbul byte,short,int,long fp float,double boolean & char
    	 * -komposit
    	 * string,array,class dan interface
    	 */
    	
    	int kecepatan;
    	long hari,detik,jarak;
    	
    	kecepatan = 300000;
    	hari = 100;
    	
    	detik = hari * 24 * 60 * 60;
    	jarak = kecepatan * detik;
    	
    	System.out.print("Dalam " + hari);
    	System.out.print(" hari, cahaya merambat sejauh " );
    	System.out.println(jarak + " kilometer");
    	
	}
}
