import java.util.Scanner;

// �����û�������������������ĸ�λ����
//�����λ����2��4�����������ϲ����һ�Ƚ�����
//�����λ���� ��3��5��7�������������ϲ���ж��Ƚ�����
//�������������лл���������´���������
public class zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("������:");
		int i = scanner.nextInt();
        int a = i%10;
		if(a==2||a==4){
			System.out.println("��ϲ����һ�Ƚ�!"); }
		else if((a==3)||(a==5)||(a==7)){
			System.out.println("��ϲ���ж��Ƚ�!"); }
		else{
			System.out.println("лл���������´�������");
		}
		}

	}

