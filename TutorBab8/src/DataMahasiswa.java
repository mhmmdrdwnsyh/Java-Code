public class DataMahasiswa {
	
	String namaMhs, NPM;
	void identitas() {
		namaMhs ="Ani Lestari";
		NPM ="51419999";
		System.out.println("nama mahasiswa = " + namaMhs);
		System.out.println("NPM = " + NPM);
	}
	
	public static void main(String[] agrs) {
		
		DataMahasiswa data1 = new DataMahasiswa();
		System.out.println(" ");
		data1.identitas();
		
	}
	
	
		
	}

