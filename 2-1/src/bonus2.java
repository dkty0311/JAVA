import java.util.Scanner;
public class bonus2 {
	public static void main(String[] args) {
		System.out.print("돈의 액수를 입력하세요>>");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		
		if(money>0) {
				System.out.printf("오만원 : %d 개  ",money/50000);
				money-=((money)/50000)*50000;
				System.out.printf("만원 : %d 개  ",money/10000);
				money-=((money)/10000)*10000;
				System.out.printf("천원 : %d 개  ",money/1000);
				money-=((money)/1000)*1000;
				System.out.printf("500원 : %d 개  ",money/500);
				money-=((money)/500)*500;
				System.out.printf("100원 : %d 개  ",money/100);
				money-=((money)/100)*100;
				System.out.printf("10원 : %d 개  ",money/10);
				money-=((money)/10)*10;
				System.out.printf("1원 : %d 개  ",money/1);
				
		}
		else
			System.out.println("0이상의 값을 입력해주세요");
	
	}
}
