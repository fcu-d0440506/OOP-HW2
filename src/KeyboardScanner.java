import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int x;
		float y;
		String name;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�п�J�@�Ӿ��:");
		x=scanner.nextInt();
		System.out.println("�п�J�@�ӯB�I��:");
		y=scanner.nextFloat();
		System.out.println("�п�J�A���W�r:");
		name=scanner.next();
		System.out.printf("Hi %s,the multiplication of %d and %f is %e",name,x,y,x*y);
		
		
		

	}

}
