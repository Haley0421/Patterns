/**
 * Created by painter on 9/9/15.
 */
public class Countdown {

    public static String pattern( int n){
    	String sting = "";
	    for(int j=n; j>0; j--){
			for(int i=j; i>0; i--){
				sting=sting+i;
			}
			sting=sting+"\n";
		}
		return sting;
		
		
	}
	

    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("You can use this method to test your work and see output");
        System.out.println();
        System.out.print(pattern(10));
    }
}
