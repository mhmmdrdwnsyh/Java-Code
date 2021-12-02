public class Hello {
	// [1] deklarasikan variabel x dengan bertipe data String
	String x;
    Hello(String x){
         x = x;
         
         
    } 
    
    
    
    
    
    
    public static void main(String args[]) {
        Hello t1 = new Hello("Integrated Laboratory");
        // [2] membuat objek baru dari class Hello dengan nama t2, kemudian memiliki nilai parameter "Universitas Gunadarma"
        Hello t2 = new Hello("Universitas Gunadarma");
        
        System.out.println(t1 + " " + t2);
    }
}
