import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList <Integer> linkListEle = new LinkedList <Integer>();
        linkListEle.add(2);
		linkListEle.add(5);
		linkListEle.add(7);
		linkListEle.add(1 , 3);
		System.out.println(linkListEle+"\n");


		System.out.println("After adding first element : ");
		linkListEle.addFirst(1);
		System.out.println(linkListEle+"\n");

		System.out.println("After adding Last element : ");
		linkListEle.addLast(10);
		System.out.println(linkListEle+"\n");

		System.out.println("After deleting First element : ");
		linkListEle.removeFirst();
		System.out.println(linkListEle+"\n");

		System.out.println("After deleting Last element :");
		linkListEle.removeLast();
		System.out.println(linkListEle+"\n");

		// remove element using index
		System.out.println("After remove element using index value 2 is");
		linkListEle.remove(2);
		System.out.println(linkListEle+"\n");

		System.out.println("size of the array is : "+linkListEle.size());




		
	}
}
