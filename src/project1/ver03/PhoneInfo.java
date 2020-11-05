package project1.ver03;

public class PhoneInfo{
 
	String name;
	private String phoneNumber;
	private String birthday;
 
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
  
	}
 
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name; 
		this.phoneNumber = phoneNumber;
		this.birthday = null;
	}
	
	public void showPhoneInfo() {
		System.out.println(name+"\n"+phoneNumber);
		if(birthday!=null) {
			System.out.println(birthday);
			System.out.println();
		}
	}
}