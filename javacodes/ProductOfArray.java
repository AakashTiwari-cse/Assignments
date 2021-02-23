// find product array of a given array without using division operator
//product array is an array where value at current index is multiple of all elements in the main array except value at that index in the main array
// Time Complexity  = O(n)

import java.util.*;
class ProductOfArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the  array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the  array: ");
		int i;
		for(i = 0 ; i < n ; i++)
			a[i] = sc.nextInt();
		int product[] = new int[n];
		int left_product[] = new int[n];
		int right_product[] = new int[n];

		int curr_product = 1;
		left_product[0] = 1; 
		for(i = 1 ; i < n ; i++)
		{
			curr_product *= a[i-1];
			left_product[i] = curr_product;
		}
		curr_product  = 1;
		for(i = n-1 ; i >-1; i--)
		{
			product[i] = left_product[i] * curr_product;
			curr_product *= a[i]; 
		}
		for(i = 0 ; i < n ; i++)
			System.out.print(" "+product[i]);

	}
}