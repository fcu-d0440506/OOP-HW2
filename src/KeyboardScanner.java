import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int x;
		float y;
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入一個整數:");
		x=scanner.nextInt();
		System.out.println("請輸入一個浮點數:");
		y=scanner.nextFloat();
		System.out.println("請輸入你的名字:");
		name=scanner.next();
		System.out.printf("Hi %s,the multiplication of %d and %f is %e",name,x,y,x*y);
		
		
		

	}

}
