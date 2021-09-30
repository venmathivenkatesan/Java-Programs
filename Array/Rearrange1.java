class Rearrange1 
{
	static void rearrange(int arr[], int n)
    {
        // consider pivot=0
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        //Arrange positive and negative numbers and swap alternatively
        int pos = i+1, neg = 0;
 
        
        while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
    }
 
    // to print array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }
 
    
    public static void main (String[] args)
    {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9,7};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
    }
}

