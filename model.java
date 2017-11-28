package project;
import javax.annotation.Generated;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import org.hibernate.type.DateType;

	@Entity
public class model {
		@Id
		@Generated(value = { "" })
	String train_no[]=new String[5];
    String train_name[]=new String[5];
    String depart[]=new String[5];
    String arrive[]=new String[5];
    String fare[]=new String[5];
    String days_run[]=new String[5];
    String quota[]=new String[5];
    String availability[]=new String[5];
    
    
 model()
{
    this.train_no=train_no;
    this.train_name=train_name;
    this.depart=depart;
    this.arrive=arrive;
    this.fare=fare;
    this.days_run=days_run;
    
} 

public String[] getTrain_no() {
	return train_no;
}

public void setTrain_no(String[] train_no) {
	this.train_no = train_no;
}

public String[] getTrain_name() {
	return train_name;
}

public void setTrain_name(String[] train_name) {
	this.train_name = train_name;
}

public String[] getDepart() {
	return depart;
}

public void setDepart(String[] depart) {
	this.depart = depart;
}

public String[] getArrive() {
	return arrive;
}

public void setArrive(String[] arrive) {
	this.arrive = arrive;
}

public String[] getFare() {
	return fare;
}

public void setFare(String[] fare) {
	this.fare = fare;
}

public String[] getDays_run() {
	return days_run;
}

public void setDays_run(String[] days_run) {
	this.days_run = days_run;
}

public String[] getQuota() {
	return quota;
}

public void setQuota(String[] quota) {
	this.quota = quota;
}

public String[] getAvailability() {
	return availability;
}

public void setAvailability(String[] availability) {
	this.availability = availability;
}


public String display(String train_no[],String train_name[],String depart[],String arrive[],String fare[],String days_run[],String quota[], String[] availability){
    int i;
    System.out.println("Train_no\t"  +  "Train_name\t"  +  "depart\t"  +  "arrive\t"	+	"days_run\t"		+	"quota\t"	+	"availability\t");
    for(i=0;i<1;i++)
    	System.out.println(train_no[i]+"\t" +  train_name[i]+"\t" +   depart[i]  +"\t"+	arrive[i]	+"\t"+	days_run[i]	+"\t"+	quota[i]  +"\t"+	 availability[i]+"\t");
    	return "1";

}


}



