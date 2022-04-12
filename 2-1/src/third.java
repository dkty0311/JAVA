import java.util.Scanner;
public class third {
	public static void main(String[] args) {
		System.out.println("논리 연산을 입력하세요");
		Scanner sc=new Scanner(System.in);
		boolean a=sc.nextBoolean();
		String op=sc.next();
		boolean b=sc.nextBoolean();

		
		switch(op){
		case "AND","and":
			System.out.println(a&&b);
			break;
		case "OR","or":
			System.out.println(a||b);
			break;
		default:
			System.out.println("올바른 연산자를 입력하세요");
			break;
		}
		
	}
}
