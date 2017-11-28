package project;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Passenger pass=new Passenger();
		Scanner s=new Scanner(System.in);
		String[] name=new String[10];
		String[] gender=new String[10];
		String[] age=new String[10];
		String[] aadhar_no=new String[10];
		String[] phone_no=new String[10];
		String[] email_id=new String[10];
		String[] irctc_acc=new String[10];
		for(int i=0;i<5;i++){
			name[i]=s.next();
			gender[i]=s.next();
			age[i]=s.next();
			aadhar_no[i]=s.next();
			phone_no[i]=s.next();
			email_id[i]=s.next();
			irctc_acc[i]=s.next();
			pass.display(name,gender,age,aadhar_no,phone_no,email_id,irctc_acc);
			
		
		}
		
	}
}
