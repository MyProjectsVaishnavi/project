package project;

import javax.annotation.Generated;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import org.hibernate.type.DateType;

	@Entity

public class Passenger {
		@Id
		@Generated(value = { "" })

String[] name=new String[10];
String[] gender=new String[10];
String[] age=new String[10];
String[] aadhar_no=new String[10];
String[] phone_no=new String[10];
String[] email_id=new String[10];
String[] irctc_acc=new String[10];
public String[] getName() {
	return name;
}
public void setName(String[] name) {
	this.name = name;
}
public String[] getGender() {
	return gender;
}
public void setGender(String[] gender) {
	this.gender = gender;
}
public String[] getAge() {
	return age;
}
public void setAge(String[] age) {
	this.age = age;
}
public String[] getAadhar_no() {
	return aadhar_no;
}
public void setAadhar_no(String[] aadhar_no) {
	this.aadhar_no = aadhar_no;
}
public String[] getPhone_no() {
	return phone_no;
}
public void setPhone_no(String[] phone_no) {
	this.phone_no = phone_no;
}
public String[] getEmail_id() {
	return email_id;
}
public void setEmail_id(String[] email_id) {
	this.email_id = email_id;
}
public String[] getIrctc_acc() {
	return irctc_acc;
}
public void setIrctc_acc(String[] irctc_acc) {
	this.irctc_acc = irctc_acc;
}




public String display(String name[],String gender[],String age[],String	aadhar_no[],String phone_no[],String email_id[],String irctc_acc[]){
    int i;
    System.out.println("name\t"  +  "gender\t"  +  "age\t"  +  "aadhar_no\t"	+	"phone_no\t"		+	"email_id\t"	+	"irctc_account\t");
    for(i=0;i<1;i++)
    	System.out.println(name[i]+"\t" +  gender[i]+"\t" +   age[i]  +"\t"+	aadhar_no[i]	+"\t"+	phone_no[i]	+"\t"+	email_id[i]  +"\t"+	 irctc_acc[i]+"\t");
    	return "1";

}
}