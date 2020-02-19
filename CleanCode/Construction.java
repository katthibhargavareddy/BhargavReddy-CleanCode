import java.io.*;
import java.util.*;
class Gnana
{
int Construct(String str,int a)
{
int p=0;
if(str.equalsIgnoreCase("Standard material"))
p=1200*a;
else if(str.equalsIgnoreCase("Above Standard Material"))
p=1500*a;
else if(str.equalsIgnoreCase("High Standard Material"))
p=1800*a;
else if(str.equalsIgnoreCase("High Standard Material and Fully automated home"))
p=2500*a;
return p;
}
}
class Construction
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
Gnana obj=new Gnana();
String str=s.nextLine();
int a=s.nextInt();
System.out.println(obj.Construct(str,a));
}
}