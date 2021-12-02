import java.util.*;

public class Fabonacci {
	public static void main(String[] args) {
        int SeriesNum ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan bilangan Fibonacci : ");
        SeriesNum=sc.nextInt();
             int[] num = new int[SeriesNum];
             num[0] = 0;
             num[1] = 1;
            //number should be sum of last two numbers of Series     
             for(int i=2; i < SeriesNum; i++){
                 num[i] = num[i-1] + num[i-2];
             }
             System.out.println("fibonacci series : ");
             for(int i=0; i< SeriesNum; i++){
                     System.out.print(num[i] + " ");
             }
    }

}
