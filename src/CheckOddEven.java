import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int word;
		Scanner scanner=new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr:");
		word=scanner.nextInt();
		if(word%2==1)
		{
			System.out.println("���Ƭ��_��");
		}
		else if(word%2==0)
		{
			System.out.println("���Ƭ�����");
		}

	}

}
