import static java.lang.Math.*;

import java.util.Random;
public class Creatingtheusersage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int ageUser1=random.nextInt(50);
		int ageUser2=random.nextInt(50);
		System.out.println("The age of user1:"+ageUser1);
		System.out.println("The age of user2:"+ageUser2);
		if (ageUser1!=ageUser2) {
			System.out.println(Math.max(ageUser1, ageUser2));
			System.out.println(Math.min(ageUser1, ageUser2));

		}
		else {
			System.out.println("They have the same age");
		}
		
	}

}
