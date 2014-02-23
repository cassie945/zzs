



import java.util.Scanner;

public class Yuan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please input the radius of the circle:");
		
		double r = scanner.nextDouble();
		scanner.close();
		
		double l = 2 * 3.14 * r;
		double s = 3.14 * r * r;
		
		System.out.println("The circumference is " + l);
		System.out.println("The area is " + s);
		
	}

}
