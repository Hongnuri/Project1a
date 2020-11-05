package project1.ver07;

 
public class PhoneSchoolInfo extends PhoneInfo {

	private String major;
	private int year;
	
	public PhoneSchoolInfo(String name, String phoneNumber,String major, int year) {
	super(name, phoneNumber);
	this.major = major;
	this.year = year;
	}
	public void showPhoneInfo(){
	super.showPhoneInfo();
	System.out.println("전공 :" + major);
	System.out.println("학년 :" + year);
	System.out.println();
	}
}