import java.util.Scanner;
class CopyingArray 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of an array : ");
	 int size=sc.nextInt();
	 int arr1[]=new int[size];
	 int arr2[]=new int[arr1.length];
	 if(size>0 && size<100)
	{
	 System.out.println("Enter the array :");
	 for(int i=0;i<size;i++) 
	   {
	     arr1[i]=sc.nextInt();
	   }

	 System.out.print("original array : ");
	 for(int i=0;i<arr1.length;i++) 
	   {
	     System.out.print(arr1[i]+" ");
	   }
	   System.out.println();

	 for(int i=0;i<arr1.length;i++) 
	   {
	     arr2[i]=arr1[i];
	   }
	  System.out.print("modified array in reversed order : ");
	 for(int i=arr2.length-1;i>=0;i--)
		{
	      System.out.print(arr2[i]+" ");
	    }
		System.out.println();
	}
	else
	{
	  System.out.println("Enter valid data");
	}
	}
}
