package project1.ver04;

import java.util.Scanner;

public class PhoneBookManager{

	public PhoneInfo[] pInfo;
	public int numOfpInfo;
	
	
		public PhoneBookManager (int num) {
			pInfo = new PhoneInfo[num];
			numOfpInfo = 0;
		}
		
	
		public void dataInput() {
			  
			System.out.println("데이터 입력을 시작합니다.");
			System.out.println("1.일반, 2.대학, 3.회사");
			int input = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			PhoneInfo info=null;
		  
			switch(input){
			case 1:
				info=readPhoneBook();
				break;
			case 2:
				info=readUnivBook();
				break;
			case 3:
				info=readCompBook();
				break;
			default:System.out.println("잘못입력하였습니다.");
		    break;
			}
			pInfo[numOfpInfo++]=info;
			System.out.println("데이터 입력 완료");
		  
		 	}
		

	public PhoneInfo readPhoneBook() {
		System.out.print("이름:");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("핸드폰번호:");
		String phoneNumber=MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name,phoneNumber);
	}
	public PhoneInfo readUnivBook()	{
		System.out.print("이름:");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("전화번호:");
		String phoneNumber=MenuViewer.keyboard.nextLine();
		System.out.print("전공:");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("학년:");
		int year=MenuViewer.keyboard.nextInt();
		return new PhoneSchoolInfo(name,phoneNumber,major,year);
	}
	public PhoneInfo readCompBook() {
		System.out.print("이름:");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("전화번호:");
		String phoneNumber=MenuViewer.keyboard.nextLine();
		System.out.print("회사:");
		String company=MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name,phoneNumber,company);
	}
	
	public void dataSearch() {
		boolean isFind = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다!");      
		String searchN = sc.nextLine();
	 
		for(int i=0; i<numOfpInfo;i++) {
			System.out.print("검색할 이름:"+pInfo[i].name);
		    if(searchN.compareTo(pInfo[i].name)==0) {
		       pInfo[i].showPhoneInfo();
		       System.out.println("데이터 검색이 완료되었습니다.");
		       isFind = true;
		    }
		}
		if(isFind==false)
			System.out.println("일치하는 정보가 없습니다.");
	}
	
	
	public void dataDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다!");
		System.out.print("이름:");
		String deleteN = sc.nextLine();
	
		int deleteIdx = -1;
	 
		for(int i=0; i<numOfpInfo; i++) {
			if(deleteN.compareTo(pInfo[i].name)==0) {
		      
		       pInfo[i]=null;
		     
		       deleteIdx = i;
		       
		       numOfpInfo--;
			}
		}
	 
		if(deleteIdx==-1) {
	    
	    System.out.println("일치정보 없음. 삭제된 데이터가 없습니다.");
		}
		else {
			for(int i=deleteIdx; i<numOfpInfo; i++) {
				pInfo[i] = pInfo[i+1];
			}
			System.out.println("데이터 삭제가 완료되었습니다.");
		}
	 
	}
	
	public void dataAllShow() {
		for(int i=0; i<numOfpInfo;i++) {
	    
	    pInfo[i].showPhoneInfo();
		}
	}
	
	public static void printMenu() {
		
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("선택 :");
		
		
	}
}

class MenuViewer {
	static Scanner keyboard = new Scanner(System.in);
	public static void showMenu() {
 
	System.out.println("선택하세요..");
	System.out.println("1. 데이터 입력");
	System.out.println("2. 데이터 검색");
	System.out.println("3. 데이터 삭제");
	System.out.println("4. 주소록 출력");
	System.out.println("5. 데이터 종료");
	}
}