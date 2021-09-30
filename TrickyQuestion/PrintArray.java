// Take 10 input from user and store in array and print on screen.

import java.util.*;
class PrintArray
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of an array : ");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 if(size>0 && size<100)
     {
	     
	    System.out.println("Enter the array :");
	    for(int i=0;i<size;i++) 
	   {
	      arr[i]=sc.nextInt();
	   }
      
	 System.out.print("The given array are : ");
	 for(int i=0;i<arr.length;i++)
	   {
	     System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	 }
	 else
	 {
	   System.out.println("enter valid input ");
	 }
		
	}
}
