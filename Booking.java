package project;

import javax.annotation.Generated;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import org.hibernate.type.DateType;

	@Entity



public class Booking {
		@Id
		@Generated(value = { "" })
	String train_name[]=new String[5];
	String from_city[]=new String[5];
    String to_city[]=new String[5];
    String no_of_seats[]=new String[5];
    String adult[]=new String[5];
    String children[]=new String[5];
    String senior_citi_male[]=new String[5];
    String senior_citi_female[]=new String[5];
    String berth[]=new String[5];
    String date_journey[]=new String[5];
    String ticket_fare[]=new String[5];
	public String[] getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String[] train_name) {
		this.train_name = train_name;
	}
	public String[] getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String[] from_city) {
		this.from_city = from_city;
	}
	public String[] getTo_city() {
		return to_city;
	}
	public void setTo_city(String[] to_city) {
		this.to_city = to_city;
	}
	public String[] getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(String[] no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String[] getAdult() {
		return adult;
	}
	public void setAdult(String[] adult) {
		this.adult = adult;
	}
	public String[] getChildren() {
		return children;
	}
	public void setChildren(String[] children) {
		this.children = children;
	}
	public String[] getSenior_citi_male() {
		return senior_citi_male;
	}
	public void setSenior_citi_male(String[] senior_citi_male) {
		this.senior_citi_male = senior_citi_male;
	}
	public String[] getSenior_citi_female() {
		return senior_citi_female;
	}
	public void setSenior_citi_female(String[] senior_citi_female) {
		this.senior_citi_female = senior_citi_female;
	}
	public String[] getBerth() {
		return berth;
	}
	public void setBerth(String[] berth) {
		this.berth = berth;
	}
	public String[] getDate_journey() {
		return date_journey;
	}
	public void setDate_journey(String[] date_journey) {
		this.date_journey = date_journey;
	}
	public String[] getTicket_fare() {
		return ticket_fare;
	}
	public void setTicket_fare(String[] ticket_fare) {
		this.ticket_fare = ticket_fare;
	}
	
	
	public String display(String train_name[],String from_city[],String to_city[],String no_of_seats[],String adult[],String children[],String senior_citi_male[],String senior_citi_female[], String[] berth,String[] date_journey,String[] ticket_fare){
	    int i;
	    System.out.println("Train_name\t"  +  "from_city\t"  +  "to_city\t"  +"no_of_seats\t"+ " adult\t"	+	"children\t"		+	"senior_citi_male\t"	+	"senior_citi_female\t"  +	"berth\t" + 	"date_journey\t" +	"ticket_fare\t");
	    for(i=0;i<1;i++)
	    	System.out.println(train_name[i]+"\t" +  from_city[i]+"\t" +   to_city[i]  +"\t"+ no_of_seats[i] +"\t"+	adult[i]	+"\t"+	children[i]	+"\t"+	senior_citi_male[i]  +"\t"+	 senior_citi_female[i]+"\t" + "\t"+ berth[i] +"\t"+ date_journey[i] + "\t"+ ticket_fare[i]);
	    	return "1";


}
}
