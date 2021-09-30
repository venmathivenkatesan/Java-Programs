// How to find common elements in three sorted Array.

class CommonElements 
{
	void commonElements(int arr1[], int arr2[], int arr3[])
	{
	  int x=0,y=0,z=0;

		while(x<arr1.length && y<arr2.length && z<arr3.length)
		{
		 if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
			{
			  System.out.print(arr1[x]+" ");
		      x++;
			  y++;
			  z++;
		    }
			else if(arr1[x] > arr2[y])
			{
			 y++;
			}
			else if(arr2[y] > arr3[z])
			{
			 z++;
			}
			else
			{
			 x++;
			}
		}
	}
	public static void main(String[] args) 
	{
		CommonElements ob =new CommonElements();

		int arr1[]={3,5,10,20,40,80};
		int arr2[]={1,3,20,80,100};
		int arr3[]={3,4,20,30,70,80,120};
        
		System.out.print("Common elements are : ");

		ob.commonElements(arr1, arr2, arr3);

		
	}
}
