import java.util.*;
public class Array {

	public static void main(String args[])
	{
		int i,x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int [] arr=new int[x];
		for(i=0;i<x;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<x;i++)
			System.out.println(arr[i]);
			
	}
}
