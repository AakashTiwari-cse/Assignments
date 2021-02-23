// From a given array of elements find the largest number which can be formwed fromthe elements of the aarray and is divisible by 3 

// Time Complexity : sorting  O(N*Logn) , and for checking the number and forming the largest number  O(N) hence final TC : O(N*Logn)
import java.util.*;
import java.util.Arrays;
import java.util.Queue;
class LargestMultipleof3
{
	public static Queue <Integer> q0 = new LinkedList<>();
	public static Queue <Integer> q1 = new LinkedList<>();
	public static Queue <Integer> q2 = new LinkedList<>();

	public static int check(int a[] , int sum)
	{
		int i;
		if(sum % 3 == 0)
			return 1; 
		else if(sum % 3 == 1)
		{
			if( !q1.isEmpty() )
			{
				q1.remove();
				return 0 ; 
			}
			else if ( !q2.isEmpty())
			{
				q2.remove();
				if ( !q2.isEmpty())
				{
					q2.remove();
					return 0;
				}
				else
					return -1 ;
			}
		}
		else
		{
			if( !q2.isEmpty() )
			{
				q2.remove();
				return 0 ;
			}
			else if ( !q1.isEmpty())
			{
				q1.remove();
				if ( !q1.isEmpty())
				{
					q1.remove();
					return 0 ;
				}
				else
					return -1 ; 
			}
			
		}
		return -1;

	} 
	public static int[] reverse_sort(int a[] , int size )
	{
		int i,temp ,r = size-1;
		Arrays.sort(a);
		for(i=0 ; i < java.lang.Math.ceil(size/2) ; i++)
		{
			temp = a[i];
			a[i] = a[r];
			a[r] = temp;
			r--;
		}
		return a;


	}
	public static int value(int a[] , int n )
	{
		int sum = a[0];
		for(int i= 1 ; i < n ; i++)
			sum  = sum*10 + a[i];
		return sum;
	}

	public static void main(String args[])
	{
		int i;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(i= 0 ; i<n ; i++)
			a[i] = sc.nextInt();
		int sum = 0 ;
		for(i= 0 ; i<n ; i++)
			sum += a[i] ;



		for(i= 0 ; i<n ; i++)
		{
			if (a[i] % 3 == 0)
				q0.add(a[i]);
			else if(a[i] % 3 == 1)
				q1.add(a[i]);
			else
				q2.add(a[i]);
		}

		int x = check(a ,sum) ;

		int l = q0.size();
		int m = q1.size();
		int n1 = q2.size();
		int size = (int)l+m+n1;
			
		int final1[] = new int[size];

		if(x == 1 )
		{
			int b[] = reverse_sort(a ,n);
			System.out.print("\n\n"+value(b , n));
		}
		else if(x ==-1)
			System.out.print("NOT Possible.");
		else
		{
			System.out.print("Value  at queues : "+q0+" "+q1+ " " +q2+" ");

			for(i = 0 ; i < l ; i++)
			{
				if(!q0.isEmpty())
					final1[i] = q0.remove();
				else
					break;
			}

			for(i = l ; i < l+m ; i++)
			{
				if(!q1.isEmpty())
					final1[i] = q1.remove();
				else
					break;
			}

			for(i = l+m ; i < l+m+n ; i++)
			{
				if(!q2.isEmpty())
					final1[i] = q2.remove();
				else
					break;
			}
			int final2[] = reverse_sort(final1 , size);

			System.out.print("\n\n"+value(final2 , size));
		}

	}
}