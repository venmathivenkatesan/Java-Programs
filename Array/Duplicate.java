// 6. Find Duplicates in an array.

import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the array : ");
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}  
		
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=i+1;j<arr.length;j++)
			{
		     if(arr[i]==arr[j])
				{
			     System.out.println("The Duplicate element is : "+arr[i]);
			    }
		    }
		}
	}
}
