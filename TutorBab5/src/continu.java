public class continu {
	public static void main(String[] agrs) {
		
		int i = 0;
		
		do {
			i++;
			if (i==4)
				continue;
			System.out.println("iterasi ke : " + i);
			if (i==5)
				break;
		}while (i<=7);
			
		}
	}

