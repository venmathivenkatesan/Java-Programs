import java.util.*;
class DiscountCalculate 
{
	public static void main(String[] args) 
	{ 
		int discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your purchase amount : ");
		 int purchaseAmount = sc.nextInt();

		 if(purchaseAmount>=0 && purchaseAmount<1000)
		{
		  System.out.println("Your total amount is "+purchaseAmount+" and you get 0% discount");

	    }
		else if(purchaseAmount>=1000)
		{
		  
		  System.out.println("Your total amount is "+purchaseAmount+" and you get 10% discount");
          
		  discount=(purchaseAmount*10)/100;
		  int finalamt = purchaseAmount - discount;
		  System.out.println("Your total amount to be paid : "+finalamt);
		}
		else
		{
		 System.out.println("enter valid amount");
		}

	}
}
