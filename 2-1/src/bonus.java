import java.util.Scanner;
public class bonus {
	public static void main(String[] args) {
		System.out.print("식을 입력하세요>>");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		String b=sc.next();
		double c=sc.nextDouble();
		
		switch(b) {
		case "+":
			System.out.printf("연산결과 %s",a+c);
			break;
		case "-":
			System.out.printf("연산결과 %s",a-c);
			break;
		case "*":
			System.out.printf("연산결과 %s",a*c);
			break;
		case "/":
			System.out.printf("연산결과 %s",a/c);
			break;
		default:
			System.out.println("올바른 연산자를 입력해");
		
		}
		
				
	}
}
