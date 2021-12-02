public class op_String {
	public static void main(String[] agrs) {
		
		String lokasi = "integrated Laboratory";
		String var1 = "Belajar di " + lokasi;
		System.out.println(var1);
	
		
		String sub_lokasi = lokasi.substring(0,7);
		System.out.println(" ");
		System.out.println("mengambil isi sebagian String");
		System.out.println("lokasi = " + sub_lokasi);

		
		System.out.println("============operator Penugasan============");
		
		/* A = 5	A = 5
		 * A += B	A = A + B
		 * A -= B	A = A - B
		 * A *= B	A = A * B
		 * A /= B	A = A / B
		 * A %= B	A = A % B
		 * A &= B	A = A & B
		 * A |= B	A = A | B
		 * A ^= B	A = A ^ B
		 */
		
		// M I S A L
		int a = 5;
		int b = 7;
		
		//Penjumlahan
		b += a; // b = b + a
		System.out.println("nilai b = " + b);
		
		//Pengurangan
		// b = 12 (Pengaruh dari hasil operasi sebelumnya)
		b -= a; // b = 12 - 5
		System.out.println("nilai b = " + b);
		
		//Perkalian
		// b = 7
		b *= a; 
		System.out.println("nilai b = " + b);
		
		//Pembagian
		// b = 35
		b /= a; 
		System.out.println("nilai b = " + b);
		
		//modulus
		// b = 7
		b %= a; // 7 mod 5	
		System.out.println("nilai b = " + b);
		
		//1
		int angka1 = 25;
		    angka1 %= 8;
		    angka1 += 14;
		    System.out.println(angka1);
		//2
		int angka2 = 5;
		    angka2 *= 8;
		    angka2 /= 5;
		    System.out.println(angka2);    
		//3
		int angka3 = 20;
		    angka3 *= 8;
		    angka3 /= 5;
		    System.out.println(angka3);    
		//4
		int angka4;
			angka4 = 100;
			angka4 /= 20;
			angka4 *= 5;
		    System.out.println(angka4);
		//5
		int angka5;
			angka5 = 7 %5;
			angka5 += 13;
			angka5 /= 5;
		    System.out.println(angka5);
	}
}
