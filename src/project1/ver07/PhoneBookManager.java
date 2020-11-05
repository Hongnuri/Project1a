package project1.ver07;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookManager{
    static Scanner keyboard = new Scanner(System.in);

	public PhoneInfo[] pInfo;
	public int numOfpInfo;
	
	HashSet<PhoneInfo> set;

		public PhoneBookManager () {
			set = new HashSet<PhoneInfo>();
			numOfpInfo = 0;
		}
	
		public PhoneInfo readPhoneBook() {
			System.out.print("이름:");
			String name=keyboard.nextLine();
			System.out.print("핸드폰번호:");
			String phoneNumber=keyboard.nextLine();
			return new PhoneInfo(name,phoneNumber);
		}
		public PhoneSchoolInfo readUnivBook()	{
			System.out.print("이름:");
			String name=keyboard.nextLine();
			System.out.print("전화번호:");
			String phoneNumber=keyboard.nextLine();
			System.out.print("전공:");
			String major=keyboard.nextLine();
			System.out.print("학년:");
			int year=keyboard.nextInt();
			return new PhoneSchoolInfo(name,phoneNumber,major,year);
		}
		public PhoneCompanyInfo readCompBook() {
			System.out.print("이름:");
			String name=keyboard.nextLine();
			System.out.print("전화번호:");
			String phoneNumber=keyboard.nextLine();
			System.out.print("회사:");
			String company=keyboard.nextLine();
			return new PhoneCompanyInfo(name,phoneNumber,company);
		}
	
		public void readBook() {
			  
			System.out.println("데이터 입력을 시작합니다.");
			System.out.println("1.일반, 2.대학, 3.회사");
			int input = keyboard.nextInt();
			keyboard.nextLine();
			PhoneInfo info=null;
		  
			switch(input){
			case SubMenuItem.NORMAL:
				info=readPhoneBook();
				break;
			case SubMenuItem.SCHOOL_FRIEND:
				info=readUnivBook();
				break;
			case SubMenuItem.COM_FRIEND:
				info=readCompBook();
				break;
			default:System.out.println("잘못입력하였습니다.");
		    break;
			}
			
			if (set.add(info)==false) {
				System.out.println("중복 된 데이터가 있습니다. 덮어쓸까요 ?");
				String hjh = keyboard.nextLine();
				if (hjh.equalsIgnoreCase("y")) {
					set.remove(info);
				} else {
					System.out.println("입력 취소");
				}
			}
			set.add(info);
			System.out.println("데이터 입력 완료");
		 	}
	
	public void dataSearch() {
		boolean isFind = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 검색을 시작합니다!");      
		String searchN = sc.nextLine();
		Iterator<PhoneInfo> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			PhoneInfo PInfo = itr.next();
			if (searchN.equals(PInfo.getName())) {
				System.out.println("데이터를 찾았습니다.");
				PInfo.showPhoneInfo();
				isFind = true;
			} 
		}
//		for(int i=0; i<numOfpInfo;i++) {
//			System.out.print("검색할 이름:"+pInfo[i].name);
//		    if(searchN.compareTo(pInfo[i].name)==0) {
//		       pInfo[i].showPhoneInfo();
//		       System.out.println("데이터 검색이 완료되었습니다.");
//		       isFind = true;
//		    }
//		}
		if(isFind==false)
			System.out.println("일치하는 정보가 없습니다.");
	}
	
	//데이터삭제
	public void dataDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 삭제를 시작합니다!");
		System.out.print("이름:");
		String deleteN = sc.nextLine();
	
		int deleteIdx = -1;
		
		Iterator<PhoneInfo> itr = set.iterator();
		while(itr.hasNext()) {
			// 하단의 for 문이 변화
			PhoneInfo PInfo = itr.next();
			if (deleteN.equals(PInfo.getName())) {
				System.out.println("데이터를 삭제했습니다.");
				set.remove(PInfo);
			} 
		}
//		for(int i=0; i<numOfpInfo; i++) {
//			if(deleteN.compareTo(pInfo[i].name)==0) {
//		       //요소 삭제를 위해 null값으로 변경
//		       pInfo[i]=null;
//		       //삭제된요소의 인덱스를 저장
//		       deleteIdx = i;
//		       //전체 저장된 정보중 -1 차감
//		       numOfpInfo--;
//			}
//		}
	 
//		if(deleteIdx==-1) {
//	    //검색한 데이터가 없어 삭제되지 않을때
//	    System.out.println("일치정보 없음. 삭제된 데이터가 없습니다.");
//		}
//		else {
//			for(int i=deleteIdx; i<numOfpInfo; i++) {
//				pInfo[i] = pInfo[i+1];
//			}
//			System.out.println("데이터 삭제가 완료되었습니다.");
//		}
	 
	}
	
	public void dataAllShow() {
		Iterator<PhoneInfo> itr = set.iterator();
		while(itr.hasNext()) {
			// 하단의 for 문이 변화
			PhoneInfo PInfo = itr.next();
			
			PInfo.showPhoneInfo();
				
			 
		}
	}
	
	public static void printMenu() {
		
		System.out.println("메뉴를 선택하세요 !");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("선택 :");
	}
}