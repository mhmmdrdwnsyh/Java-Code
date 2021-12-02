public class act10 {
	public static void main(String[] args) {
        
		//nomor 1
		String z = "Pemrograman Berbasis Objek";
     
        //[1] mendeklarasikan variabel result yang digunakan untuk menyimpan nilai operasi dari method substring
        String x1 = z.substring(21,26); 
        	System.out.println(x1);
        
        //nomor 2
        String str1 = "Belxjar Jxvx";
        
        //[1] mendeklarasikan variable str2 yang digunakan untuk menyimpan nilai operasi method replace terhadap variable str1
        String str2 = str1.replace( "x" , "a");
        	System.out.println(str2);

        //nomor 3
        String str3 = "belajar java";
        
        //[1] mendeklarasikan variabel str2 yang digunakan untuk menyimpan nilai operasi dari method toUpperCase terhadap variabel str1
        String str4 = str3.toUpperCase();
        //[2] menampilkan output dari variabel str2
       		System.out.println(str4);
	}
}	
