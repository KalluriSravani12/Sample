import java.util.Scanner;
import static java.lang.Math.*;
public class Degreetoradiuns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter the number:");
		int celsius=input.nextInt();
		System.out.println(toRadians(celsius));
		System.out.println(toDegrees(toRadians(celsius)));

	}

}
