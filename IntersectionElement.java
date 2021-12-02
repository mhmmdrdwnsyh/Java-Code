import java.util.Scanner;
public class Himpunann {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] himpunanA= new int[100];
        int[] himpunanB= new int[100];
        int jumlahAnggotaA;
        int jumlahAnggotaB;
        
        
        System.out.print("Masukkan Banyak Elemen 'A': ");
        jumlahAnggotaA = input.nextInt();
        
        for(int i=1;i<=jumlahAnggotaA;i++)
        {
        System.out.print("Masukkan Elemen ke-"+i+": ");
        himpunanA[i]=input.nextInt();
        }
        System.out.print("A = {");
        for(int i=1; i<=jumlahAnggotaA; i++){
        System.out.print(himpunanA[i]+ ",");
        }
        System.out.println("}");
    
        System.out.println();
        System.out.print("Masukkan Banyak Elemen 'B': ");
        jumlahAnggotaB = input.nextInt();

        for(int i=1;i<=jumlahAnggotaB;i++){
        System.out.print("Masukkan Elemen ke-"+i+": ");
        himpunanB[i]=input.nextInt();

        }
     System.out.print("B = {");
        for(int i=1; i<=jumlahAnggotaB; i++){
        System.out.print(himpunanB[i]+ ",");
        
        }
        System.out.println("}");
        System.out.println();
        
        
        System.out.print("\nJadi irisannya adalah {");
        for( int i=1;i<=jumlahAnggotaB;i++){
        boolean adaSama = false;
        for(int j=1;j<=jumlahAnggotaA;j++){
        if(himpunanB[i]==himpunanA[j])
        adaSama=true;
        }
        if(adaSama==true){
        System.out.print(himpunanB[i]+",");
        }
        }
        System.out.println("}");
        }
        

}
}
