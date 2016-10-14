import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		String x,y;
		int flag=0;
		Scanner scanner=new Scanner(System.in);
		while(flag==0)
		{
			System.out.println("請輸入兩段字:");
			x=scanner.next();
			y=scanner.next();
			if(x.equalsIgnoreCase(y)==true)
			{
				System.out.println("It's the same");
				flag=1;
			}
		}

	}

}
