
public class chengfabiao {

	public static void main(String[] args) {//String[] args是一个数组
		// TODO Auto-generated method stub
	  System.out.println("\t\t\t\t九九乘法表\n");
	  System.out.println("\t\t------------\n");
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){//b<=a換成b<=9的話运行时显示横竖对齐。//执行b<=a显示斜行
				System.out.print(b+"*"+a+"="+(a*b)+"\t");
			}
			System.out.println();//主要是换行作用
					
		}

	}

}

