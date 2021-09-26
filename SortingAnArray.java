// 3. Write a program to sort the given array.

import java.util.Scanner;
class SortingAnArray 
{
	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		 System.out.println("Enter the array : ");
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();  
		}
		
		
        System.out.print("Given Array is : ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}
        System.out.println();

        //sorting an array
		for(int i=0;i<arr.length;i++)
		{
		  for(int j=i+1;j<arr.length;j++)
			{
			  if(arr[i]>arr[j])
				{
			     temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			    }
		    }
		}
		System.out.println();
		
        System.out.print("Sorted Array is : ");
		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+" ");
		}
	}
}
