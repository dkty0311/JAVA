import java.util.Scanner;


public class LoginMain{
	public static void main(String[] args) {
		MemberManage manage=new MemberManage(400);
		
		while(true) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("           E.회원 가입을 하시려면 (e)를 입력해주세요             ");
			System.out.println("           L.로 그 인을 하시려면 (l)을 입력해주세요             ");
			System.out.println("           Q.종료하시려면 (q)를 입력해주세요                 ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			
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
				System.out.println("종료되었습니다");
				sc.close();
				return;
			default:
				System.out.println("올바른 메뉴를 선택하여주세요");
			
			}
			
		}
	}
}

class MemberInfo {			//회원정보 클래스
	private String id,pwd,name;
	private double tall;
	
	public MemberInfo(String id, String pwd,String name,double tall) {	//가져온정보 초기화		
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
		members=new MemberInfo[num];			//가입자 수 체크
		idx=0;
	}

	
	
	

	public void memberRegister() {		//회원가입 메소드
		String id,pwd,name = null;
		double tall=0;
		String temp;
		Scanner sc=new Scanner(System.in);
	while(true) {	
		System.out.print("가입할 아이디를 입력하세요 : "); 
		id=sc.nextLine();
		if(!CheckId(id)) {								//중복아이디 체크
			System.out.println("사용중인 아이디 입니다");
		}
		else {
			System.out.print("가입할 암호를 입력하세요 : ");
			pwd=sc.nextLine();
			System.out.print("가입자 성함을 입력하세요 : ");
			name=sc.nextLine();
			System.out.print("가입자의 키를 입력해주세요 : ");
			temp=sc.nextLine();	
			try {
				tall=Double.parseDouble(temp);
			}
			catch(NumberFormatException e){
				System.out.println("숫자로 입력되지 않았습니다 처음부터 다시 진행해주세요"); 			//숫사자가 입려되면 변수tall에 값 저장
				break;																	//그렇지 않으면 처음부터 진행 break
			}
			
			if(tall<=0) {
				System.out.println("0보다 큰 수를 입력해주세요"); 	//0보다 작을때 배열 저장을 건너뛴다
				continue;
			}
			members[idx]=new MemberInfo(id,pwd,name,tall);		//가입정보 저장
			idx++;
			System.out.println("가입이 완료되었습니다");
			break;
			}
		}
	}

		
	
	
	
	public boolean CheckId(String id) {		//id 중복여부를 True False로 리턴
		if(idx==0) 							//가입자가 없을떄 가입가능
			return true;
		for(int i=0; i<idx; i++) {
			if(members[i].getId().equals(id))	//입력한 아이디와 가입했던 아이디를 반복하여 체크, equals()메소드 사용
				return false;
		}
		return true;						//모두통과시 암호입력으로 이동
	}
	
	
	
	
	public void MemberLogin() {
		String id,pwd;			//loginsf(success fail)에 로그인 성공 불가 여부를 저장한다
		String loginsf="없는 아이디 입니다";
		Scanner sc=new Scanner(System.in);
		
	
		System.out.print("아이디를 입력하세요 : ");
		id= sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		pwd=sc.nextLine();
			
			
			
		for(int i=0; i<idx; i++) {						//가입된 회원수까지 반복하여 체크
				if(members[i].getId().equals(id)&&members[i].getPwd().equals(pwd)) {	
				loginsf="로그인 성공!";
				}
				else if(!members[i].getId().equals(id)) {			//비밀번호 입력전 아이디가 있는지 체크
					loginsf="없는 아이디 입니다";
				}
				else if(members[i].getId().equals(id)&&!members[i].getPwd().equals(pwd)) {			//아이디배열에있는 비밀번호와 같지 않으면 출력
				loginsf="틀린 암호 입니다";
				}
			}
	
			System.out.println(loginsf);
		}
}
