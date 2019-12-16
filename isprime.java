import java.io.*;
import java.util.*;
class isprime
{
	static boolean prime(int n)
	{
		int i;
		if(n<=1) return false;
		if(n<4) return true;
		for(i=3;i<Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) 
{		
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number:");
		int k=kb.nextInt();
		
		if(isprime.prime(k))
		{
			System.out.println("Success");
		}
		if(isprime.prime(k)==false)
		{
			System.out.println("Failure");
		}	 
	}
}
