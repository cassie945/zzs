//1~100不能被3整除之数之和
public class cassie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
        for(int i = 0;i<=100;i++)
		{if (i%3!=0) ;
        	sum=sum+i;}
			System.out.println("1~100不能被三整除的书的和:"+sum);
	    }

}

	


