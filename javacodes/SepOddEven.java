import java.util.*;

class SepOddEven
{
public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of square matrix:");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(i= 0;i < n ; i++)
		a[i] = sc.nextInt();
	int l = 0;
	int r = n-1;
	while(l<r)
	{
		while(a[l] % 2 == 0 && l<r)
			l++;
		while(a[r] % 2 == 1 && l<r)
			r--;
		if (a[l] % 2 == 1 && a[r] % 2 == 0 && l<r )
		{
			j = a[r];
			a[r] = a[l];
			a[l] = j;
			l++;
			r--;
			
		}	

	}
	for(i= 0;i < n ; i++)
		System.out.print(a[i]+" "); 
}
}
