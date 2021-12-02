package coba;
import java.util.Scanner;
public class cobaborak {
	public static void main(String[] args) {
		 String ulg = "y";
	        while (ulg.equals("y"))
	        {
	        System.out.println(" ");
	        Scanner input = new Scanner(System.in);
	        String ul="",lagi;
	        System.out.println(" ");
	        System.out.println("MENGHITUNG");
	        System.out.println("-----------------");
	        System.out.println("1. Penjumlahan");
	        System.out.println("2. Pengurangan");
	        System.out.println("3. Perkalian");
	        System.out.println("4. Pembagian");
	        System.out.println("=================");
	        System.out.print("[1-2-3-4] = ");
	        int a = input.nextInt();
	        System.out.println("=================");

	        switch (a) {
	            case 1:{
	                System.out.println("Penjumlahan");
	                int x = input.nextInt();
	                int y = input.nextInt();
	                System.out.println("= " + (x + y));
	                break;
	            }
	            case 2:{
	                System.out.println("Pengurangan");
	                int x = input.nextInt();
	                int y = input.nextInt();
	                System.out.println("= " + (x - y));
	                break;
	            }
	             case 3:{
	                System.out.println("Perkalian");
	                int x = input.nextInt();
	                int y = input.nextInt();
	                System.out.println("= " + (x * y));
	                break;
	             }
	            case 4:{
	              System.out.println("Pembagian");
	              int x = input.nextInt();
	              int y = input.nextInt();
	              System.out.println("= " + (x / y));
	              break;
	            } 
	        }
	        System.out.println("---------------------------------");
	        System.out.print("Apakah anda ingin mengulang (y/t)? ");
	            ulg = input.next();
	        }
	    }
	}
