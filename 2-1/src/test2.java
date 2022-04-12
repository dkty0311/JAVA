import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		int a,b;
		System.out.println("두 수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+"+"+b+"은"+(a+b));
	}
}
