import java.util.*;
class Karray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i ,n,k,s=0,j=0,temp=0;
		System.out.println("enter the  size of arr1ay:");
		n = sc.nextInt();
		System.out.println("k value:");
		k = sc.nextInt();
		int arr1[] = new int[n];
		for(i=0 ; i<n; i++)
			arr1[i] = sc.nextInt();
		while(k>0)
		{
			temp = arr1[j];
			for(i=j ; i<n; i++)
			{
				if(arr1[i] >temp)
				{
					temp = arr1[i];
					s = i;
				}
			}
			arr1[s] =arr1[j];
			arr1[j] = temp;
			j++;
			k--;
		}
		for(i=0;i<n;i++)
			System.out.print(" "+ arr1[i]);
		System.out.println(" temp value: "+temp+" index value : "+s+" array value at that s:"+arr1[s]+" j value"+ j+" array value at j "+arr1[j]);

	}
}