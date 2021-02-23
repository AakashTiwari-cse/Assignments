import java.util.*;
import java.util.Arrays ;
class PossibleTriangle
{

public static void main(String args[])

{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of array :");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(i= 0;i < n ; i++)
		a[i] = sc.nextInt();
	Arrays.sort(a);
	int minimum_no = 1 ;
	for (i = 0; i < n ; i++) 
	{
		if(a[i] <= minimum_no)
			minimum_no += a[i];
	}
	System.out.print("Minimum sum not possible: "+minimum_no);

}
}