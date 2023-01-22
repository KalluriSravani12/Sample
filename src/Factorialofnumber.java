import static java.lang.Math.*;
import java.util.Random;
public class Factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable,fact=1;
	 
	/*	int i,fact=1;
		int number=5;
		for (i=1;i<=5;i++) {
			fact=fact*i;
			
			
		}*/
		//System.out.println(fact);
		Random factorial=new Random();
		
		for (int i=0;i<=5;i++) {
			variable=factorial.nextInt(10);
			System.out.println(variable);
			for (int j=1;j<variable;j++) {
				fact=fact*j;
				}
			System.out.println(fact);
			fact =1;
			
			
			
			
			
		}
		
		
		

	}

}
