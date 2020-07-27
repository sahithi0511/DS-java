class AddArrElements
{
public static void main(String args[])
{
int [] a= {1,3,5,6};
sum(a);
}
public static void sum(int [] a)
{
int sum = 0;
for (int i=0;i<a.length;i++)
{
sum += a[i];
}
System.out.println(sum);
}
}
