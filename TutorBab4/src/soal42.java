public class soal42 {
	 public static int fee (char model){
	        int price = 0;
	        switch(model){
	            case 'A':
	                price = 50;
	                break;
	            case 'B':
	                price = 20;
	                break;
	            case 'C':
	                price = 40;
	                break;
	            default:
	                price = 100;
	                break;
	        }
	        return price;
	    }
}
