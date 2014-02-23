import java.util.Scanner;

// 根据用户输入的数，求出这个数的个位数，
//如果个位数是2，4，则输出“恭喜您中一等奖”，
//如果个位数是 “3，5，7”，则输出“恭喜您中二等奖”，
//其它的则输出“谢谢您，请您下次再来”。
public class zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("输入数:");
		int i = scanner.nextInt();
        int a = i%10;
		if(a==2||a==4){
			System.out.println("恭喜您中一等奖!"); }
		else if((a==3)||(a==5)||(a==7)){
			System.out.println("恭喜您中二等奖!"); }
		else{
			System.out.println("谢谢您，请您下次再来！");
		}
		}

	}

