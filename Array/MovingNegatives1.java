//Move all negative elements to one side of an array.

class MovingNegatives1 
{
	public static void main(String[] args) 
	{
		int arr[] = {3, -3, 5, -7, 4, 9,-2,10};

		System.out.print("Given array : ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}
        System.out.println();
		int n = arr.length;
        
		movingNegatives(arr,n);
        
		System.out.print("After moving all negative elements to one side : ");
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");
		}

		//for(int i : arr)
		//{
		//  System.out.print(i+" ");
		//}
	}

	private static void movingNegatives(int[] arr, int n)
	{
	  int tempAll[]= new int[n];
	  int j=0;

	  for(int i = 0; i < arr.length; i++)
		{
	      if(arr[i]>=0)
			{
		     tempAll[j++] = arr[i];
		    }
	    }
	   
	   if(j == n || j == 0)
          return;

	   for(int i = 0; i < arr.length; i++)
		{
	      if(arr[i]<0)
			{
		     tempAll[j++] = arr[i];
		    }
	    }

		for(int i = 0; i < tempAll.length; i++)
		{
	      
		      arr[i] = tempAll[i];
		    
	    }
	}
}
