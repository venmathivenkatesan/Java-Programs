class CheckArrayFrontAndBack 
{
	public static void main(String[] args) 
	{
		//int arr[]={2,3,15,14,3,2};
		int arr[]={1,2,5,5,2,1};
        int n = arr.length;
		int flag = 0;
		for (int i = 0; i <= n / 2 && n != 0; i++) 
		{
            if (arr[i] != arr[n - i - 1]) 
			{
                flag = 1;
                break;
            }
        }
 
        if (flag == 1)
		{
            System.out.println("Given array elements are not same from Front to Back");
        }
		else
		{
			System.out.println("Given array elements are same from front to back");
			System.out.print("Array elements are : " );
			for(int i=0;i<arr.length;i++)
			{
			  System.out.print(arr[i]+" ");
			}
			System.out.println();
            
        }
	}
}
