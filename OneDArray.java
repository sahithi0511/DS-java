class Temp{
int roll;
String name;
Temp(int roll, String name){
this.roll = roll;
this.name = name;
}
}
class OneDArray{
public static void main(String args[]){
Temp [] t = new Temp[4];
t[0] = new Temp(1,"sahi");
t[1] = new Temp(2,"manu");
t[2] = new Temp(3,"Devi");
t[3] = new Temp(4,"Pranathi");
for(int i=0 ; i<t.length;i++){
System.out.println("My Name is " + t[i].name + "holding roll number" + t[i].roll + " ");
}
}
}