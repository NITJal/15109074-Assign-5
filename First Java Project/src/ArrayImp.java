import java.util.*;
public class ArrayImp {
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]=new int[]{1,2,3,4,5};
		//error int c[]=new int[5]{1,2,3,4,5};
		//error int d[]=new int[2]{1,2,3,4,5};
		int e[]={1,2,3,4,5};
		a[0]=2;
		System.out.println("a[0]="+a[0]+" ");
		System.out.println("b[3]="+b[3]+" ");
		System.out.println("e[2]="+e[2]+" ");
		
		int i,x,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		x=sc.nextInt();
		System.out.println("Enter array elements:");
		int arr[]=new int[x];
		for(i=0;i<x;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<x;i++)
			sum+=arr[i];
		System.out.println("Sum of array elements:"+sum);
		
		
		
	}

}
