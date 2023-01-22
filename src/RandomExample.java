import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int randomInteger;
		//int sum=0,Average=0;
		
		//int j=0;
		//System.out.println(randomInteger);
		for (int i=0;i<5;i++) {
			randomInteger=random.nextInt(10);
			//sum=sum+randomInteger;
			//Average=sum/2;
			
		System.out.println( randomInteger+ " ");
	}
		//System.out.println(sum);
		//System.out.println(Average);
		
/*		do {
			
			System.out.println("Random integer loop:"+j+"="+random.nextInt(10));
			j++;
		}while(j<10);*/
		

	}

}
