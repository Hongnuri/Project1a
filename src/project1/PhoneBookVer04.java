package project1;
	
import project1.ver04.PhoneCompanyInfo;
import project1.ver04.PhoneSchoolInfo;
import project1.ver04.PhoneInfo;
import java.util.*;

//static class MenuViewer {
//	static Scanner keyboard = new Scanner(System.in);
//	public static void showMenu() {
// 
//	System.out.println("선택하세요..");
//	System.out.println("1. 데이터 입력");
//	System.out.println("2. 데이터 검색");
//	System.out.println("3. 데이터 삭제");
//	System.out.println("4. 주소록 출력");
//	System.out.println("5. 데이터 종료");
//	}
//}

public  class PhoneBookVer04 {
	public static void main(String[] args){
	
		project1.ver04.PhoneBookManager phoneBookManager = new project1.ver04.PhoneBookManager(100);
		while(true) {
//			MenuViewer.showMenu();
			System.out.println("선택하세요..");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터 삭제");
			System.out.println("4. 주소록 출력");
			System.out.println("5. 데이터 종료");
			
			int input=new Scanner(System.in).nextInt();
//			MenuViewer.keyboard.nextLine();
  
			switch(input) {
			case 1:
				phoneBookManager.dataInput();
				break;
			case 2:
				phoneBookManager.dataSearch();
				break;
			case 3:
				phoneBookManager.dataDelete();
				break;
			case 4:
				phoneBookManager.dataAllShow();
				break;	
			case 5: System.out.println("프로그램을 종료합니다.");
		     	return;
			}
		}
	}
}
