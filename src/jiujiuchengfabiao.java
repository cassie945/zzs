//九九乘法表的编译
public class jiujiuchengfabiao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t九九乘法表");
		   for(int i=1;i<=9;i++){//输入行
           for(int j=1;j<=i;j++){    //输入每行的列数
        	   System.out.print(+i+"*"+j+"="+(i*j)+"\t");
        	   }  
           System.out.println();  
           } 

	}

}
