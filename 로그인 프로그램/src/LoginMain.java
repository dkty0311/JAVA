import java.util.Scanner;


public class LoginMain{
	public static void main(String[] args) {
		MemberManage manage=new MemberManage(400);
		
		while(true) {
			System.out.println("�����������������������������������������������������������������");
			System.out.println("           E.ȸ�� ������ �Ͻ÷��� (e)�� �Է����ּ���             ");
			System.out.println("           L.�� �� ���� �Ͻ÷��� (l)�� �Է����ּ���             ");
			System.out.println("           Q.�����Ͻ÷��� (q)�� �Է����ּ���                 ");
			System.out.println("�����������������������������������������������������������������");
			
			Scanner sc=new Scanner(System.in);
			char choice=sc.next().charAt(0);

			
			switch(choice) {
			case 'E','e':
				manage.memberRegister();
				break;
			case 'L','l':
				manage.MemberLogin();
				break;
			case 'Q','q':
				System.out.println("����Ǿ����ϴ�");
				sc.close();
				return;
			default:
				System.out.println("�ùٸ� �޴��� �����Ͽ��ּ���");
			
			}
			
		}
	}
}

class MemberInfo {			//ȸ������ Ŭ����
	private String id,pwd,name;
	private double tall;
	
	public MemberInfo(String id, String pwd,String name,double tall) {	//���������� �ʱ�ȭ		
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.tall=tall;
	}
	public String getId() {return id;}
	public String getPwd() {return pwd;}
	public String getName() {return name;}
	public double getTall() {return tall;}
}



class MemberManage {
	private MemberInfo[] members;
	private int idx;
	
	public MemberManage(int num) {
		members=new MemberInfo[num];			//������ �� üũ
		idx=0;
	}

	
	
	

	public void memberRegister() {		//ȸ������ �޼ҵ�
		String id,pwd,name = null;
		double tall=0;
		String temp;
		Scanner sc=new Scanner(System.in);
	while(true) {	
		System.out.print("������ ���̵� �Է��ϼ��� : "); 
		id=sc.nextLine();
		if(!CheckId(id)) {								//�ߺ����̵� üũ
			System.out.println("������� ���̵� �Դϴ�");
		}
		else {
			System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
			pwd=sc.nextLine();
			System.out.print("������ ������ �Է��ϼ��� : ");
			name=sc.nextLine();
			System.out.print("�������� Ű�� �Է����ּ��� : ");
			temp=sc.nextLine();	
			try {
				tall=Double.parseDouble(temp);
			}
			catch(NumberFormatException e){
				System.out.println("���ڷ� �Էµ��� �ʾҽ��ϴ� ó������ �ٽ� �������ּ���"); 			//�����ڰ� �Է��Ǹ� ����tall�� �� ����
				break;																	//�׷��� ������ ó������ ���� break
			}
			
			if(tall<=0) {
				System.out.println("0���� ū ���� �Է����ּ���"); 	//0���� ������ �迭 ������ �ǳʶڴ�
				continue;
			}
			members[idx]=new MemberInfo(id,pwd,name,tall);		//�������� ����
			idx++;
			System.out.println("������ �Ϸ�Ǿ����ϴ�");
			break;
			}
		}
	}

		
	
	
	
	public boolean CheckId(String id) {		//id �ߺ����θ� True False�� ����
		if(idx==0) 							//�����ڰ� ������ ���԰���
			return true;
		for(int i=0; i<idx; i++) {
			if(members[i].getId().equals(id))	//�Է��� ���̵�� �����ߴ� ���̵� �ݺ��Ͽ� üũ, equals()�޼ҵ� ���
				return false;
		}
		return true;						//�������� ��ȣ�Է����� �̵�
	}
	
	
	
	
	public void MemberLogin() {
		String id,pwd;			//loginsf(success fail)�� �α��� ���� �Ұ� ���θ� �����Ѵ�
		String loginsf="���� ���̵� �Դϴ�";
		Scanner sc=new Scanner(System.in);
		
	
		System.out.print("���̵� �Է��ϼ��� : ");
		id= sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		pwd=sc.nextLine();
			
			
			
		for(int i=0; i<idx; i++) {						//���Ե� ȸ�������� �ݺ��Ͽ� üũ
				if(members[i].getId().equals(id)&&members[i].getPwd().equals(pwd)) {	
				loginsf="�α��� ����!";
				}
				else if(!members[i].getId().equals(id)) {			//��й�ȣ �Է��� ���̵� �ִ��� üũ
					loginsf="���� ���̵� �Դϴ�";
				}
				else if(members[i].getId().equals(id)&&!members[i].getPwd().equals(pwd)) {			//���̵�迭���ִ� ��й�ȣ�� ���� ������ ���
				loginsf="Ʋ�� ��ȣ �Դϴ�";
				}
			}
	
			System.out.println(loginsf);
		}
}
