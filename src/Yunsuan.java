import java.util.Scanner;


public class Yunsuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("����a:");
	int a = scanner.nextInt();
		System.out.println("����b:");
		int b = scanner.nextInt();
		if (a%b==0||a+b>1000) {
		System.out.println("a:"+a);
		}
  else
	  System.out.println("a:"+b);
 }

 }
