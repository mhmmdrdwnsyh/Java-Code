public class terbesar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Berapa Kali Input: ");
            int panjangArray = scan.nextInt();
            int angka[]=new int[panjangArray];
            int min,max;
            for(int i=0;i<panjangArray;i++)
            {
                System.out.print("Masukkan angka ke-"+i+" : ");
                angka[i]= scan.nextInt();
            }
            min=angka[0];
            max=angka[0];
           
            for(int i=0;i<panjangArray;i++)
            {
                if(angka[i]<min)
                    min=angka[i];
                if(angka[i]>max)
                    max=angka[i];
                System.out.println("Bilangan : "+angka[i]);
            }
       
        System.out.println("Bilangan Terkecil:" +min);
        System.out.println("Bilangan Terbesar:" +max);
        }
}
