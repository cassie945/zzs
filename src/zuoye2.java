import java.util.Scanner;

//2.��������˰�ļ��㷽�����±�����ĳ�˵���������15300(��ôӿ���������)����ͨ��if��else��䣬������ý�������˰
//����	��˰����	                            ˰��(%)
//1	������500Ԫ��	                      5
//2	����500Ԫ��2,000Ԫ�Ĳ���	     10
//3	����2,000Ԫ��5,000Ԫ�Ĳ���	     15
//4	����5,000Ԫ��20,000Ԫ�Ĳ���     20
//5	����20,000Ԫ	                     25

public class zuoye2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		int i =scanner.nextInt();
		if(i<500){
			System.out.println("˰��Ϊ5��");	
		}
		else if((i>500)&&(i<2000)){
			System.out.println("˰��Ϊ10��");
		}
		else if((i>2000)&&(i<5000)){
			System.out.println("˰��Ϊ15��");
		}
		else if((i>5000)&&(i<20000)){
			System.out.println("˰��Ϊ20��");
		}
		else{
			System.out.println("˰��Ϊ25��");
		}

	}

}

	