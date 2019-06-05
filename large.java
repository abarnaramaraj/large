import java.util.*;
import java.lang.*;
import java.io.;
public class Large_num
{
public static void main(String[] args)
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of element you want");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the element");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j]);
{
temp=a[j];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.pintln("large order");
for(int i=0;i<n-1;i++)
{
System.out.println(a[i]+"");
}
System.out.println(a[n-1]);
}
}

