import java.util.*;
class CheckArrayListNum 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of integer Array : ");
        int size = sc.nextInt();
		System.out.println();

		ArrayList <Integer> intarrlist = new ArrayList <Integer>();
        System.out.println("Enter "+size+" values : ");

		if(size > o)
        {
		for(int i=0;i<size ; i++)
		{
		  intarrlist.add(sc.nextInt());
		}
		
		System.out.println();


		System.out.println("Enter element to check : ");
		int checkEle = sc.nextInt();


		if(intarrlist.contains(checkEle))
		{
        System.out.println(checkEle+" present in the array");
		}
		else
		{
		System.out.println(checkEle+"not  present in the array");
		}
		}
		else
		{
		 System.out.println("enter valid number");
		}
	}
}
