import java.util.Scanner;


public class BanJiChengJi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i =scanner.nextInt();
		int score =scanner.nextInt();
		int sum =scanner.nextInt();
		sum = score + sum ;
				while(i<=20)
				{
					System.out.println("班级人数"+sum);
					i++;
				}
				int avg =scanner.nextInt();
				avg = sum / i;
				System.out.println("全班总成绩"+avg);
				
		

	}

}
