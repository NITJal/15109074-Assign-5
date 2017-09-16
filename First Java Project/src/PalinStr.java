import java.util.Scanner;

public class PalinStr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be checked:");
		String s=sc.nextLine();
		int len=s.length();
		int i,j;
		int flag=1;
		i=0;
		j=len-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=0;
				break;
			}
			i++;
			j--;
		}
		if(flag==1)
		{
			System.out.println(s+" is a palindrome.");
		}
		else
		{
			System.out.println(s+" is not a palindrome.");
		}
	}

}
