import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		String x,y;
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入兩段字:");
		x=scanner.next();
		y=scanner.next();
		if(x.equalsIgnoreCase(y)==true)
		{
			System.out.println("It's the same");
		}
		else
		{
			System.out.println("It's different");
		}

	}

}
