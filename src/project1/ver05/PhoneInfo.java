package project1.ver05;
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
		System.out.println("이름:"+name+"\n"+"전화번호"+phoneNumber);
		if(birthday!=null) {
			System.out.println(birthday);
			System.out.println();
		}
	}

	public String getName() {
		return null;
	}
}