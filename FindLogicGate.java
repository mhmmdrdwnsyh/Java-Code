import java.io.*;
import java.util.Scanner;

public class AljabBool {
	 static void sopl(String a) {
	        System.out.println(a);
	    }

	    static void sop(String a) {
	        System.out.print(a);
	    }

	    static void exit() {
	        sopl("");
	        sopl("");
	        sopl("==============TERIMA KASIH====================");
	        System.exit(0);
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int p;
	        int q;
	        int pil;
	        
	        sopl("========================");
	        sopl("====ALJABAR BOOLEAN=====");
	        sopl("========================");
	        sopl("");
	        sopl("");
	        sop("Masukkan Nilai a (1 atau 0) : ");
	        p = input.nextInt();
	        sopl("");
	        sop("Masukkan Nilai b (1 atau 0) : ");
	        q = input.nextInt();
	        if (p > 1 || q > 1) {
	            sopl("Maaf Inputan Anda Salah ");
	        } else {
	            boolean hasil = true;
	            while (hasil) {
	                sopl("===================");
	                sopl("===Menu Pilihan ===");
	                sopl("=1.AND            =");
	                sopl("=2.OR             =");
	                sopl("=3.NAND           =");
	                sopl("=4.NOR            =");
	                sopl("=5.EXOR           =");
	                sopl("=6.EXNOR          =");
	                sopl("=7.Exit           =");
	                sopl("");
	                sop("PIlih menu: ");
	                pil = input.nextInt();
	                switch (pil) {
	                    case 1:
	                        if ((p == 1) && (q == 1)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a AND b) atau (a.b) : 1");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a AND b) atau (a.b) : 0");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 2:
	                        if ((p == 0) && (q == 0)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a OR b) atau (a+b) : 0");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a OR b) atau (a+b) : 1");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 3:
	                        if ((p == 1) && (q == 1)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a NAND b) atau (a.b) : 0");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a NAND b) atau (a.b) : 1");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 4:
	                        if ((p == 0) && (q == 0)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a NOR b) atau (a+b) : 1");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a NOR b) atau (a+b) : 0");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 5:
	                        if ((p == 0) && (q == 0) || (p == 1) && (q == 1)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a EXOR b) atau (a+b) : 0");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a EXOR b) atau (a+b) : 1");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 6:
	                        if ((p == 0) && (q == 0) || (p == 1) && (q == 1)) {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a EXNOR b) atau (a X b)^ : 1");
	                            sopl("");
	                            sopl("");
	                        } else {
	                            sopl("");
	                            sopl("");
	                            sopl("Hasil dari (a EXNOR b) atau (a X b)^ : 0");
	                            sopl("");
	                            sopl("");
	                        }
	                        break;
	                    case 7:
	                        exit();
	                        break;

	                    default:
	                        sopl("salah inputan");
	                        break;
	                }

	            }
	        }

	    }

	}
