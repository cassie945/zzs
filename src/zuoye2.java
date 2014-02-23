import java.util.Scanner;

//2.个人所得税的计算方法如下表。现在某人的月收入是15300(最好从控制条输入)，请通过if…else语句，求出他该交的所得税
//级数	含税级距	                            税率(%)
//1	不超过500元的	                      5
//2	超过500元至2,000元的部分	     10
//3	超过2,000元至5,000元的部分	     15
//4	超过5,000元至20,000元的部分     20
//5	超过20,000元	                     25

public class zuoye2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int i =scanner.nextInt();
		if(i<500){
			System.out.println("税率为5％");	
		}
		else if((i>500)&&(i<2000)){
			System.out.println("税率为10％");
		}
		else if((i>2000)&&(i<5000)){
			System.out.println("税率为15％");
		}
		else if((i>5000)&&(i<20000)){
			System.out.println("税率为20％");
		}
		else{
			System.out.println("税率为25％");
		}

	}

}

	