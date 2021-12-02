public class PernyataanContinue {
    public static void main (String[] args) {
        
    	int i = 0;
        do {
            i++;
            if (i==10) continue;
            System.out.print(" " + i);
            if (i==15) break;
            
        }while (i <= 15);
        System.out.println("");
       
        System.out.println("Menggunakan continue untuk melewatkan 10");
    }
}