package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver06.MenuItem;
import project1.ver06.MenuSelectException;
import project1.ver06.PhoneBookManager;


public class PhoneBookVer06 implements MenuItem
{

	public static void main(String[] args) 
	{
      
    Scanner scanner = new Scanner(System.in);
   
    PhoneBookManager pbm = new PhoneBookManager(100); 
      
    int menu = 0;
    int flag = 1;

    while(flag==1) {
    	
		System.out.println("선택하세요.");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램 종료");
		System.out.print("선택 : ");
            
        try {
        menu = scanner.nextInt();
            
	        switch(menu)
	        {
	        case DATA_INPUT:
	           pbm.readBook();
	           break;
	           
	        case DATA_SEARCH:
	           pbm.dataSearch();
	           break;
	           
	        case DATA_DELETE:
	           pbm.dataDelete();
	           break;
	           
	        case DATA_ALLSHOW:
	           pbm.dataAllShow();
	           break;
	           
	        case EXIT:
	           System.out.println("프로그램을 종료합니다.");
	           flag = 0;
	           break;
	        }
	        if (menu<1 || menu>5) 
		        {
	            MenuSelectException mse = new MenuSelectException();
	            throw mse; 
		        }
		    }
	        catch (MenuSelectException e)
	        {
	            System.err.println("에러내용 : MenuSelectException 예외입니다.");
	            System.err.println("1부터 5까지 입력해주세요");
	        }
	        catch (InputMismatchException e) 
	        {
	            System.err.println("에러내용 : InputMismatchException 예외입니다.");
	            System.err.println("1부터 5까지 입력해주세요");
	            scanner.nextLine(); 
	        }
	        catch (NullPointerException e)
	        {
	            System.err.println("에러내용 : NullPointerException 예외입니다.");
	            System.err.println("검색어를 정확하게 입력하세요");
	        }
	    }   
	}
}