import java.util.*;
class HashMapDemo2 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
        int size = sc.nextInt();
		System.out.println();

		if(size > 0)
		{
		HashMap <String , String> mapList = new HashMap <>();
        System.out.println("Enter "+size+" Items : ");
		for(int i=0;i<size ; i++)
		{
		  System.out.println("enter key : ");
		  String key = sc.next();
		 
          System.out.println("Enter value : ");
		  String value = sc.next();
		 
		  mapList.put(key , value);
		}

		System.out.println();
        System.out.println("HashMap items are : ");
		System.out.println(mapList);
		System.out.println();

        
		System.out.println("key values are : "+mapList.keySet());
		System.out.println();

		System.out.println("values are : "+mapList.values());
		System.out.println();

		}
		else
		{
		 System.out.println("enter valid number ");
		}

	}
}
