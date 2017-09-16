import java.util.*;
public class PrimeNos {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,p;
		System.out.println("Enter upto which you want to find prime numbers");
		int n=sc.nextInt();
		int [] prime=new int[n+1];
		for(i=0;i<=n;i++)
			prime[i]=1;
		for(p=2;p*p<=n;p++)
		{
			if(prime[p]==1)
			{
				for(i=p*2;i<=n;i=i+p)
				{
					prime[i]=0;
				}
			}
		}
		System.out.println("Prime numbers upto "+n+" are:");
		for(p=2;p<=n;p++)
		{
			if(prime[p]==1)
			{
				System.out.println(p+" ");
			}
		}
	}
}
