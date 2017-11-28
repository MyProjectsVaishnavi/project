package project;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	        model mod=new model();
	        Scanner n=new Scanner(System.in);
	        int i;
	        String train_no[]=new String[5];
	        String train_name[]=new String[5];
	        String depart[]=new String[5];
	        String arrive[]=new String[5];
	        String fare[]=new String[5];
	        String days_run[]=new String[5];
	        String quota[]=new String[5];
	        String availability[]=new String[5];
	         for(i=0;i<2;i++){
	             train_no[i]=n.next();
	             train_name[i]=n.next();
	            depart[i]=n.next();
	            arrive[i]=n.next();
	            fare[i]=n.next();
	            days_run[i]=n.next();
	            quota[i]=n.next();
	            availability[i]=n.next();
	            mod.display(train_no,train_name,depart,arrive,fare,days_run,quota,availability);
	         }
	    

	    }

	}

