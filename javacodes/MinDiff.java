// Find minimum difference between two elements from the given array
// Time Complexity = sorting O(n*logn) , finding minimum O(n) Final TC : O(n*logn)

import java.util.*;
import java.util.Arrays ;
class MinDiff
{
	static void minimum(int a[] , int min_dif)
	{
		Arrays.sort(a);
		for(int i= 0 ; i < a.length - 1 ; i++)
		{
			if( min_dif > a[i+1] - a[i] )
				min_dif = a[i+1] - a[i] ;
		}
		System.out.print("minimum difference : "+min_dif);

	}

public static void main(String args[])

{
	int i,j, min_dif = 9999;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of array :");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(i= 0;i < n ; i++)
		a[i] = sc.nextInt();
	minimum(a , min_dif );
}
}