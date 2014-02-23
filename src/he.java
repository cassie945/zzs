
public class he {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<=10;i++){
			if (i%2!=0)//条件判断被二整除的数
			{
				continue;//继续执行上一步
			}
			sum=sum+i;//满足条件就执行此句
		}
		System.out.println("1~10之间能被2整除的数之和"+sum);//输出结果
		
		
	
	}

}
