
import java.util.*;
class ArrayList1 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of integer Array : ");
        int size = sc.nextInt();
		System.out.println();

		ArrayList <Integer> intarrlist = new ArrayList <Integer>();
        System.out.println("Enter "+size+" values : ");
		for(int i=0;i<size ; i++)
		{
		  intarrlist.add(sc.nextInt());
		}
		System.out.println();
        System.out.println("Integer ArrayList values are : "+"\n");
		System.out.println(intarrlist);
		
	}
}
