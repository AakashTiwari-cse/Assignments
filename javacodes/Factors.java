import java.util.*;
import java.util.Queue;

class Factors
{

public static  Queue<Integer> q 
            = new LinkedList<>();

public static void factors(int a [])
{
	int j=0 , max = a[0];
	for(int i = 1 ; i < a.length ; i++)
	{
		if(a[i] > max)
			max = a[i] ; 
	}
	for(j = 1;j < max +1; j++)
	{
		for(int i = 0 ;  i < a.length ; i++)
		{
			if(a[i]%j == 0)
				
		}
		q.add(j);
	}
}

public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of square matrix:");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(i= 0;i < n ; i++)
		a[i] = sc.nextInt();

	j =a[0];
	for(i= 0;i < n ; i++)
		if(j<a[i])
			j = a[i];
	for(i= 0;i < n ; i++)
	{
		factors(a);

	}
	System.out.print(q);
	}
}