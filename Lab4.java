import java.util.Scanner;
public class Lab4{
	public static void main(String[] args){
		final int MINDAYS = 1;
		final int MAXDAYS = 1000;
		System.out.println("How many days would you like to set?");
		Scanner time = new Scanner(System.in);
		int days = time.nextInt();
		if (days > MAXDAYS || days < MINDAYS) {
			System.out.println("ERROR: This number is out of our reach");
		}
		else {
			System.out.println("The amount of days set are " + days);
		}
		System.out.println("How many kids would you like in the family?");
		Scanner burdens = new Scanner(System.in);
		int kids = burdens.nextInt();
		System.out.println("There are " + kids + " kids in the family");
		for (int start = 0; start < days; start++) {
			System.out.println("Day #" + start + " Kid #" + (start % kids));
		}
		}
	}	
