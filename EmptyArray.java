class EmptyArray
{
public static void main(String args[])
{
int [] num = new int[4];
for(int i : num){
System.out.println("empty int values are "+ i +" ");
}
String [] val = new String[5];
for(String s : val){
System.out.println("String values are "+ s + " ");
}
boolean [] bol = new boolean[3];
for(boolean b : bol){
System.out.println("Boolean values are "+ b + " ");
}
double [] don = new double[5]; 
for (double d : don){
System.out.print(d + " ");
} 
EmptyArray [] em = new EmptyArray[3];
for(EmptyArray e : em){
System.out.println("Object array " +  e +" ");
}
}
}