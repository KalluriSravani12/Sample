import java.util.Scanner;
public class Findinglength {

	public static void main(String[] args) {
		String name;
		Scanner name1=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=name1.nextLine();
		System.out.println("The length of your name is "+name.length());
		System.out.println("The length of your name is "+name.toLowerCase());
		System.out.println("The length of your name is "+name.toUpperCase());
		System.out.println("The length of your name is "+name.startsWith(name));
		
		

	}

}
