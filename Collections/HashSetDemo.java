import java.util.*;
class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet <String> obj1 = new HashSet <String>();
		HashSet <String> obj2 = new HashSet <String>();

		obj1.add("Red");
		obj1.add("Green");
		obj1.add("Yellow");
		obj1.add("Pink");
		System.out.println(obj1);

		
		obj2.add("Red");
		obj2.add("Black");
		obj2.add("White");
		obj2.add("Blue");
		System.out.println(obj2);

		obj1.addAll(obj2);

		System.out.println(obj1);
	}
}
