import java.util.Scanner;
public class second {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		a=sc.nextInt();b=sc.nextInt();
		if(a<=100&&b<=100&&a<=500&&b<=50) {
			System.out.printf("점(%d,%d)은(50,50)과(100,100)의 사각형 내에 있습니다",a,b);
		}
		else
			System.out.println("범위 외의 좌표입니다");
		
	}
}
