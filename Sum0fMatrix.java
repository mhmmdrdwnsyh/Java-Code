import java.util.Scanner;

public class Matriks {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner (System.in);
	    System.out.print("Ordo Matriks = ");
	    int Ordo = input.nextInt();
	    int [][]a = new int[Ordo][Ordo];
	    int [][]b = new int[Ordo][Ordo];
	    int [][]c = new int[Ordo][Ordo];
	    //input Matriks A
	    for (int i=0; i<Ordo; i++)
	    {
	        for(int j=0; j<Ordo; j++)
	        {
	            System.out.print("Matriks A ["+(i+1)+","+(j+1)+"] = ");
	            a[i][j] = input.nextInt();
	        }
	    }
	    //input Matriks B
	    for (int i=0; i<Ordo; i++)
	    {
	        for(int j=0; j<Ordo; j++)
	        {
	            System.out.print("Matriks B ["+(i+1)+","+(j+1)+"] = ");
	            b[i][j] = input.nextInt();
	        }
	    }
	    //proses
	    for (int i=0; i<Ordo; i++)
	    {
	        for(int j=0; j<Ordo; j++)
	        {
	            c[i][j] = a[i][j] + b[i][j];
	        }
	    }
	    //output matriks hasil (C)
	    for (int i=0; i<Ordo; i++)
	        {
	        for(int j=0; j<Ordo; j++)
	        {
	            System.out.print(c[i][j]+" ");
	        }
	        System.out.println();
	        }

	}
}

