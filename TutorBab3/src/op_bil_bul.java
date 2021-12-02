public class op_bil_bul {
  public static void main(String[] agrs) {
  //unary -> operator yang hanya menggunakan 1 variabel
	  
	  int a = 1;
	  System.out.println(-a);
	  
  //increment
	  int b = 4;
	  b++;
	  System.out.println("nilai b = " +  b);
	
  //decrement
	  int c = 7;
	  b--;
	  System.out.println("nilai c = " +  c);
	  
  //prefix dan postfix
	  int x = 4;
	  System.out.printf("nilai x adalah %d \n", ++x);
	  
	  double y = 4.0;
	  System.out.printf("nilai y adalah %f \n", y++);
	  
	  
   System.out.println("==============================");
   	  int var1 = 7;
   	  int var2 = 5;
   	  int hasil;
   	  
   	  //penjumlahan
   	  hasil = var1 + var2;
	  System.out.println(var1 + " + " + var2 + " = " + hasil);
	  
   	  //pengurangan
   	  hasil = var1 - var2;
	  System.out.println(var1 + " - " + var2 + " = " + hasil);
	  
   	  //pembagian
   	  hasil = var1 / var2;
	  System.out.println(var1 + " / " + var2 + " = " + hasil);
	  
	  double var3 = 7.8;
   	  double var4 = 5.25;
   	  double hasil1;
   	  
   	  //pembagian
   	  hasil1 = var3 / var4;
	  System.out.println(var3 + " / " + var4 + " = " + hasil1);
	  
   	  //perkalian
   	  hasil = var1 * var2;
	  System.out.println(var1 + " x " + var2 + " = " + hasil);
   	  
	  //modulus
   	  hasil = var1 %  var2;
	  System.out.println(var1 + " % " + var2 + " = " + hasil);
	  
	  //relasional
	  boolean hasilBanding;

	  hasilBanding = var1 > var2;
	  System.out.println("hasil var1 > var2 = " + hasilBanding);
	  hasilBanding = var1 < var2;
	  System.out.println("hasil var1 < var2 = " + hasilBanding);
	  hasilBanding = var1 == var2;
	  System.out.println("hasil var1 = var2 = " + hasilBanding);
	  hasilBanding = var1 != var2;
	  System.out.println("hasil var1 != var2 = " + hasilBanding);



  }
}
