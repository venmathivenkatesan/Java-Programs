//

import java.util.Scanner;
class CheckOddEvenPosNeg 
{
	public static void main(String[] args) 
	{
		int pos_count=0,neg_count=0,even_count=0,odd_count=0,zero_count=0;
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
     
	 for(int i=0;i<arr.length;i++)
   	   {
	     if(arr[i]>0)
		   {
		    pos_count++;
		   }
		  
	   }
	   System.out.print("Number of positive numbers are : "+pos_count);
	   System.out.println();

	   
	   for(int i=0;i<arr.length;i++)
   	   {
	     if(arr[i]<0)
		   {
		    neg_count++;
		   }
	   }
	   System.out.print("Number of Negative numbers are : "+neg_count);
	   System.out.println();
       
	   
	   for(int i=0;i<arr.length;i++)
   	   { if(arr[i]>0)
		   {
	        if(arr[i]%2==0)
		     {
				even_count++;
		     
		     }
		   }
	   }
	    System.out.print("Number of even numbers are : "+even_count );
	   System.out.println();

	   
	   for(int i=0;i<arr.length;i++)
   	   {
	     if(arr[i]>0)
		   {
		     if(arr[i]%2!=0)
		      {
		        odd_count++;
		      }
		   }
	   }
	   System.out.print("Number of odd numbers are : "+odd_count);
	   System.out.println();

	   
	   for(int i=0;i<arr.length;i++)
   	   {
	     if(arr[i]==0)
		   {
		    zero_count++;
		   }
	   }
	   System.out.print("Number of zeros  are : "+zero_count);
	   System.out.println();
	 }
	 else
     {
	   System.out.println("Enter valid array size");
	 }
	}
}
