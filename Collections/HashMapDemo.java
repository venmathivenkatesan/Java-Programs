import java.util.*;
class HashMapDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
        int size = sc.nextInt();
		System.out.println();

		if(size > 0)
		{

		HashMap <Integer , String> mapList = new HashMap <>();
        System.out.println("Enter "+size+" values : ");
		for(int i=0;i<size ; i++)
		{
		  System.out.println("enter num : ");
		  int num = sc.nextInt();
		 
          System.out.println("Enter name : ");
		  String name = sc.next();
		 

		  mapList.put(num , name);
		}
		System.out.println();
        System.out.println("HashMap items are : ");
		System.out.println(mapList);

        mapList.put(06 , "nila");
		System.out.println("After inserting : "+mapList);

		String removeKey  = mapList.remove(04);
		System.out.println("After removing"+removeKey);
		System.out.println(mapList);

        mapList.put(07 , "mathi");
		System.out.println("After updating : "+mapList);

		System.out.println("key values are : "+mapList.keySet());
		System.out.println("values are : "+mapList.values());

		}
		else
		{
		 System.out.println("enter valid number ");
		}

	}
}
