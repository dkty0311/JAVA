import java.util.Scanner;
public class second {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		a=sc.nextInt();b=sc.nextInt();
		if(a<=100&&b<=100&&a<=500&&b<=50) {
			System.out.printf("��(%d,%d)��(50,50)��(100,100)�� �簢�� ���� �ֽ��ϴ�",a,b);
		}
		else
			System.out.println("���� ���� ��ǥ�Դϴ�");
		
	}
}
