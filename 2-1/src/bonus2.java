import java.util.Scanner;
public class bonus2 {
	public static void main(String[] args) {
		System.out.print("���� �׼��� �Է��ϼ���>>");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		
		if(money>0) {
				System.out.printf("������ : %d ��  ",money/50000);
				money-=((money)/50000)*50000;
				System.out.printf("���� : %d ��  ",money/10000);
				money-=((money)/10000)*10000;
				System.out.printf("õ�� : %d ��  ",money/1000);
				money-=((money)/1000)*1000;
				System.out.printf("500�� : %d ��  ",money/500);
				money-=((money)/500)*500;
				System.out.printf("100�� : %d ��  ",money/100);
				money-=((money)/100)*100;
				System.out.printf("10�� : %d ��  ",money/10);
				money-=((money)/10)*10;
				System.out.printf("1�� : %d ��  ",money/1);
				
		}
		else
			System.out.println("0�̻��� ���� �Է����ּ���");
	
	}
}
