import java.util.*;
import java.lang.*;

class Permut
 {
 	public static void  main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the string:");
 		String s = sc.next();
 		permutation(s,"");
 	}

 	public static void permutation(String str, String prefix)
	{	
		if (str.length() == 0)
		{
 			System.out.println("output: "+prefix+"\n");
		}
		else
		{
			System.out.println("String-"+str+" prefix-"+prefix+"\n");
			for (int i= 0; i < str.length(); i++)
			{
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}

 }

 /*void permutation(String str) {
 permutation(str, "");
 }
*/
