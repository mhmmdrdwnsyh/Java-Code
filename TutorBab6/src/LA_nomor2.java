public class LA_nomor2 {
	public static void main(String[] args) {  
        double a[][]={{5, 6}, {8, 20}};
        double b[][]={{3, 34}, {7, 6, 8}};
   
    System.out.println("Menampilkan a: ");  
        for(int i=0; i<a.length ; i++){  
            for (int j=0; j<a.length ; j++){  
                System.out.print(a[i][j]+ " ");  
            }System.out.println();  
        }  

        System.out.println("Menampilkan b: ");  
        for (int i=0; i<b.length ; i++){  
            for (int j=0; j<b.length ; j++){  
                System.out.print(b[i][j]+ " ");  
            }System.out.println();  
        }  
   
        System.out.println("Hasil m+n: ");  
        for (int i=0; i<a.length ; i++){  
            for (int j=0; j<b.length ; j++){  
                System.out.print(a[i][j]+b[i][j]+ " ");  
            }  
            System.out.println();  
        }  
    }
}
