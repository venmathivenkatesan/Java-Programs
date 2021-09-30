// Write a program to find the sum and Product of all elements of an array. 

class SumAndProduct 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,3,8};
		int sum=0;
		int product=1;

        System.out.print("Given array : ");
		for(int i=0;i<a.length;i++)
		{
		 System.out.print(a[i]+" ");
         sum=sum+a[i];
		 product=product*a[i];
		}
		System.out.println();
        System.out.print("Sum of all elements of an array : "+sum+"\n");
		System.out.println("Product of all elements of an array : "+product);
		
	}
}
