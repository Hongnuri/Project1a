package project1.ver03;

import java.util.Scanner;

public class PhoneBookManager{

	public PhoneInfo[] pInfo;
	public int numOfpInfo;
	
	
		public PhoneBookManager (int num) {
			pInfo = new PhoneInfo[num];
			numOfpInfo = 0;
		}
	
	
		public void dataInput() {
			Scanner sc = new Scanner(System.in);
			String iName, iphoneN, ibDay;
	
			System.out.println("데이터 입력을 시작합니다!");
			System.out.println("이름:");
			iName = sc.nextLine();
			System.out.println("전화번호:");
			iphoneN = sc.nextLine();
			System.out.println("생년월일:");
			ibDay = sc.nextLine();
			PhoneInfo pi = new PhoneInfo(iName, iphoneN, ibDay);
			pInfo[numOfpInfo++]=pi;
			System.out.println("데이터 입력 완료");
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
	
	//데이터삭제
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
		System.out.println("선택:");
	}
}