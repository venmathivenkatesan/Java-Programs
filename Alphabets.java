// Find the given Alphabet is uppercase or lowercase

import java.util.*;
class Alphabets 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the character : ");
	 char c = sc.next().charAt(0); 

	 if(c>=65 && c<=90)
	   {
	     System.out.println(c+" is Uppercase charecter");
	   }
	 else if(c>=97 && c<=122)
	   {
	     System.out.println(c+" is Lowercase charecter");
	   }
	  else
	   {
	     System.out.println("enter valid charecter");
	   }
	   System.out.println();
	}
}
