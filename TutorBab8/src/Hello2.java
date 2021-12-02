public class Hello2 {
	// [1] deklarasikan variabel x dengan bertipe data String
	String t1,t2;
    void antum(){
        t1 = "Integrated Laboratory";
        t2 = "Universitas Gunadarma";
        System.out.println(t1 + " " + t2);

    }
    public static void main(String[] args) {
       
    	Hello2 fulan = new Hello2();
        System.out.println(" ");
        fulan.antum();
        // [2] membuat objek baru dari class Hello dengan nama t2, kemudian memiliki nilai parameter "Universitas Gunadarma"
    }
}
