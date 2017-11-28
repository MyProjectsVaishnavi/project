package project;


import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args){ 
		  Scanner b=new Scanner(System.in);
		  Booking book=new Booking();
		   int i;
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
		    for(i=0;i<2;i++){
		    			train_name[i]=b.next();
		    			from_city[i]=b.next();
		    			to_city[i]=b.next();
		    			no_of_seats[i]=b.next();
		    			adult[i]=b.next();
		    			children[i]=b.next();
		    			senior_citi_male[i]=b.next();
		    			senior_citi_female[i]=b.next();
		    			berth[i]=b.next();
		    			date_journey[i]=b.next();
		    			ticket_fare[i]=b.next();
		    			book.display(train_name,from_city,to_city,no_of_seats,adult,children,senior_citi_male,senior_citi_female,berth,date_journey,ticket_fare);
		    	
		    }
}
}
