import java.util.Scanner;

public class SortNames {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of names you want to enter:");
		int n=sc.nextInt();
		int i,j;
		System.out.println("Enter names:");
		String names[]=new String[n+1];
		for(i=0;i<n+1;i++)
		{
			names[i]=sc.nextLine();
		}
		String temp=new String();
		for(i=0;i<n+1;i++)
		{
			for(j=i+1;j<n+1;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Sorted list of names:");
		for(i=1;i<n+1;i++)
		{
			System.out.println(names[i]);
		}
	}

}
