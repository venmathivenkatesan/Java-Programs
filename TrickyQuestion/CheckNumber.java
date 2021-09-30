// check the given number is present are not
import java.util.*;
class CheckNumber 
{
	public static void main(String[] args) 
	{
	 Boolean found = false ;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of an array : ");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 if(size>0)
	{
	  System.out.println("Enter the array :");
	 for(int i=0;i<size;i++) 
	   {
	     arr[i]=sc.nextInt();
	   }
	   System.out.println("Enter a number: ");
	   int num = sc.nextInt();
	 for(int i=0;i<arr.length;i++)
	   {
		 if(arr[i] == num)
		   {
			 found = true;
			 break;
		   }
		}
	   if(found)
		{
		  System.out.println(num +" is present in the array");
		}
		else
		{
		  System.out.println(num + " is not present in the array");
		}
	}
	else
	  {
	    System.out.println("Enter the valid size");
	  }
	 
	}
}
