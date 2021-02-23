import java.util.*;
class maxsum_array
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i ,n,curmax = 0 , prevmax = 0 ,ans=0 ,x;
		System.out.println("curmax = "+prevmax);
		System.out.println("enter the  size of array:");
		n = sc.nextInt();
		int arr1[] = new int[n];
		for(i=0 ; i < n; i++)
			arr1[i] = sc.nextInt();
		for(i=0 ; i < n; i++)
		{
			curmax = arr1[i];
			x = arr1[i] + prevmax ;
			curmax = prevmax >= x ? prevmax : x ;
			System.out.println("curmax = "+curmax);
			ans = ans > curmax ? ans: curmax ;
			prevmax = curmax;
		}
		System.out.println("Max_sum_array = "+ans);

	}
} 
