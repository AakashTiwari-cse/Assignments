import java.util.*;

class LostGuyRaghu
{
static int maax(int a[] , int c)
{
    int max =  a[0];
    for(int i = 0 ; i < c ; i++)
    {
        if(a[i] > max)
            max = a[i];
    }
    return max;
}

public static void main(String args [])
{
int a[] = {5,4,8,9,6};
int b[] = {2,3,5};
for(int i=0 ; i < 3 ; i++)
{
    int x = b[i];
    x = maax(a,x);
    System.out.println(x);
}

}

}