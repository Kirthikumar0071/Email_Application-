package training;

import java.util.Scanner;

public class email {
	 private String firstname;
	 private String secondname;
	 private String  password;
	 private String department;
	 private String Email;
	 private int mailboxcapacity=500;
	 private int dpasswordLength=10;
	 private String alternateemail;
	 private String companySuffix=".anycompany.com";
	 
	 //constructor for receive the first and last name
	 public email(String firstname,String lastname){
		 this.firstname=firstname;
		 this.secondname=lastname;
		// System.out.println("Email created  " +this.firstname+" " +this.secondname);
		 
		 //call a method for dept return dept
		 this.department=setDept();	 
		// System.out.println("Department  "+this.department);
		 
		 //call  a method for password random
		 this.password=randompass(dpasswordLength);
		 System.out.println("your passswowrd is  "+this.password);
		 
		 //GEnerate email
		 Email=firstname.toLowerCase()+""+lastname.toLowerCase()+"@"+ department+companySuffix;
		// System.out.println("your email is"+Email);
		 }
	
	 
	 //ask for the department
	 
	 private String setDept() {
		 System.out.println(" List of Deptartment \n1 for sales \n2 for development \n3 for accounting \n4 for none  \nEnter the department");
		 Scanner sc = new Scanner(System.in);
		int  dept = sc.nextInt();
		 
		 if(dept ==1) {
			 return "sales";
		 }
		 else if(dept ==2) {
			 return "development";
		 }
		 else if(dept ==3) {
			 return "accounting";
		 }
		 else {
			 return "";
		 }
		 
	 }
	 //generate random password
	 
	 private String randompass(int length) {
		 String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$&";
		 char[]password=new char[length];
		 for(int i=0;i<length;i++) {
			int rand =(int) (Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
			}
		 return new String(password);
	 }
	 
	 //set the mailbox capacity
	 public void setMailcap(int capacity) {
		 this.mailboxcapacity=capacity;
		 
	 }
	 
	 //set the alternate email
	 public void setAlternateEmail(String altemail) {
		 this.alternateemail=altemail;
		 
	 }
	 
	 //change the password
	 public void changepassword(String password) {
		 this.password=password;
		 
	 }
	 public int getMialap() {
		 return mailboxcapacity;
	 }
	 public String getAlternateEmail() {
		 return alternateemail;
	 }
	 public String getpassword() {
		 return password;
	 }
	 
	 public String showInfo() {
		 return "\nDisplay name:"+firstname+" "+secondname+
				 "\ncomapny email:"+Email+
				 "\nmail capacity:"+mailboxcapacity +"mb";
	 }
}
