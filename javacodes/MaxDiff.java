import java.util.*;
import java.lang.*;
class MaxDiff
{
	static int min (int x , int y)
	{
		if (x > y)
			return y ;
		else
			return x;
	}
	static int min1	 (int x[] , int y)
	{
		int min = x[0];
		for (int i =1 ; i<y+1 ; i++)
		{
			if(min > x[i])
				min = x[i];
		}
		return min ;
	}
public static void main(String args[])
{
	int i,j, min_so_far, max_dif = -1;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of square matrix:");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(i= 0;i < n ; i++)
		a[i] = sc.nextInt();
	min_so_far = a[0];
	for(i =1 ; i<n ; i++)
	{
		j = a[i] - min_so_far ;
		if(j > 0)
		{
			if (max_dif < j)
				max_dif = j;
		}
		System.out.println("max diff after" + i + " : " + max_dif);
		min_so_far = min1(a ,i);
	}
	System.out.print("Max difference:"+max_dif);
}
}