import java.util.Scanner;
public class bonus {
	public static void main(String[] args) {
		System.out.print("���� �Է��ϼ���>>");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		String b=sc.next();
		double c=sc.nextDouble();
		
		switch(b) {
		case "+":
			System.out.printf("������ %s",a+c);
			break;
		case "-":
			System.out.printf("������ %s",a-c);
			break;
		case "*":
			System.out.printf("������ %s",a*c);
			break;
		case "/":
			System.out.printf("������ %s",a/c);
			break;
		default:
			System.out.println("�ùٸ� �����ڸ� �Է���");
		
		}
		
				
	}
}
