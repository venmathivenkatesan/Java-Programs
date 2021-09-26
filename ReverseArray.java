// 2.Write a program to reverse the array.

import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args) 
	{
		//int arr[]={1,0,2,0,3,0};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		 System.out.println("Enter the array : ");
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();
		  
		}

        System.out.print("Original Array is : ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}
        System.out.println("\n");


        System.out.print("Reverse Array is : ");
		for(int i=arr.length-1;i>=0;i--)
		{
		 System.out.print(arr[i]+" ");
		}
	}
}
