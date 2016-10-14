import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("please enter a number:");
		  int a = scanner.nextInt();
		  if(a>0&&a<10)
		  {
			  int b = a + 96;
			  System.out.printf("%d\n",b);
		  }
		  else
		  {
			  System.out.println("other\n");
		  }
		 

	}

}
