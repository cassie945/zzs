import java.util.Scanner;

public class shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����������һ����");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] i = { 8, 4, 2, 1, 23, 344, 12 };
		int sum = 0;
		{
			if ((a == 8) || (a == 4) || (a == 2) || (a == 1) || (a == 23)
					|| (a == 344) || (a == 12)) {
				System.out.println("��������");
			} else {
				{
				System.out.println("����������");
				}
		}
		}
		 
		for (int b = 0; b < i.length; b++) {//i=arrays i��b
			sum = sum + i[b];
		}
		System.out.println("������˵����ֵ�ĺ�" + sum);

	}
}
// System.out.println("�����������һ����");
// Scanner scanner = new Scanner(System.in);
// int i=scanner.nextInt();
// boolean isInclude = false;
// for(int b=0;b<i.length;b++){
// }if(i[]==b){
// }isInclude = true;
// break;}}
// if(isInclude){System.out.println("��������");
// }
// else{
// System.out.println("����������");}
