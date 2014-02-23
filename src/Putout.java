import java.util.Scanner;
public class Putout {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的名字");
		String name = scanner.next();
		System.out.println("请输入你的性别");
		String sex =scanner.next();
		System.out.println("请输入你的年龄");
		int age =scanner.nextInt();
		scanner.close();
		System.out.println("name:"+name);
		System.out.println("sex:"+sex);
			System.out.println("age:"+age);
 
	}

}

