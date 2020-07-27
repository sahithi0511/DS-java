class ObjArr
{
public static void main(String args[])
{
int [] a = new int[3];
byte [] b = new byte[4];
short [] s = new short[3];
String [] st = new String[3];
System.out.println(a.getClass());
System.out.println(a.getClass().getSuperclass());
System.out.println(b.getClass());
System.out.println(s.getClass());
System.out.println(st.getClass());
}
}
