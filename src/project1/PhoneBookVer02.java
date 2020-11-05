package project1;

import java.util.Scanner;
import project1.ver02.PhoneInfo;

public class PhoneBookVer02 {

	static Scanner keyboard = new Scanner(System.in);

	public static PhoneInfo input() {
		System.out.print("이름 :");
		String name = keyboard.nextLine();
		System.out.print("전화번호 :");
		String phoneNumber = keyboard.nextLine();
		System.out.print("생년월일 :");
		String birthday = keyboard.nextLine();
		return new PhoneInfo(name,phoneNumber,birthday);
	}
	 
	public static void main(String args[]) {
	  
		PhoneInfo phone;
	 
		while(true) {
			System.out.println("1 : 데이터 입력 \n2 : 프로그램 종료");
			int input=keyboard.nextInt();
			keyboard.nextLine();
			if(input==1)
				phone=input();
			
			else
				break;
				phone.showPhoneInfo();
		}
	}
}
