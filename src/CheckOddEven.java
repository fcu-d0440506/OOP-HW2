import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int word;
		Scanner scanner=new Scanner(System.in);
		System.out.println("叫块计:");
		word=scanner.nextInt();
		if(word%2==1)
		{
			System.out.println("计计");
		}
		else if(word%2==0)
		{
			System.out.println("计案计");
		}

	}

}
