package project1;

import project1.ver01.PhoneInfo;

public class PhoneBookVer01 {
	public static void main(String[] args){
	  PhoneInfo phone1 = new PhoneInfo("성낙현","010-7906-3600","751130");
	  PhoneInfo phone2 = new PhoneInfo("류상미","010-7669-4120");
	  
	  phone1.showPhoneInfo();
	  phone2.showPhoneInfo();
	}
}