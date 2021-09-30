import java.util.*;
class StudentAttendence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of class held : ");
		int totalclassHeld = sc.nextInt();
		System.out.println("Enter Number of class Attend : ");
		int totalclassAttend = sc.nextInt();

		int percentage = (totalclassAttend*100)/totalclassHeld;
        
		
		
	    if(totalclassAttend <= totalclassHeld && totalclassHeld >= 0 && totalclassAttend >= 0) 
	   {
			
			if(percentage >=0 && percentage < 75)
			 {
			  System.out.println("This student scored "+percentage+ " percentage and not eligible to enter exam hall");
		      
		     }
	        else if(percentage >= 75)
	         {
		      System.out.println("This student scored "+percentage+" percentage and allowed to sit in examination"); 
		     }
	    }
		else
		{
		   System.out.println("enter valid attendence details");  
		}
		
    }
}
