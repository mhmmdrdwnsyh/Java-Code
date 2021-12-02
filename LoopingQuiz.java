import java.util.*;


public class Loopridwan {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input angka perulangan : ");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print((i + 1) + "");
            for (int j = 0; j <= i; j++) {
                System.out.print("_ ");
            }
		}
	}
}
