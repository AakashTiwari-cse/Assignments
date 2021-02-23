import java.util.*;
class PrintAdjacent
{
public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter size of square matrix:");
	int n = sc.nextInt();
	int adj[][] = new int[n][n];
	char a[] = new char[n];
	for( i=0 ; i<n ; i++)
		a[i] =  (char)(int)(97+i); 
	System.out.print("enter adjaceny matrix:");
	for( i=0 ; i<n ; i++)
		for( j=0 ; j<n ; j++)
			adj[i][j] = sc.nextInt();
	System.out.print("enter element of which adjacent you want to find:");
	char k = sc.next().charAt(0);
	int m = (int)k;
	m = k - 97;
	for( i=0 ; i<n ; i++)
	{
		if(adj[m][i] == 1)
			System.out.print(a[i]+" ");
	}	
}
}