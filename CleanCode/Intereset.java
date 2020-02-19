import java.io.*;
import java.util.*;

class Construction
{
	float simple(int p,int t,int r)
	{
		float ans=(p*t*r)/100;
		return ans;
	}
	double compond(int p,int t,int r,int n) 
	{
		float ans1=1+(r/n);
		float x=n*t;
		double ans2=Math.pow(ans1,x);
		double comp=p*ans2;
		return comp;
	}
}
class Interest
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		Construction obj=new Construction();
		int p=s.nextInt();
		int t=s.nextInt();
		int r=s.nextInt();
		int n=s.nextInt();
		System.out.println(obj.simple(p,t,r));
		System.out.println(obj.compond(p,t,r,n));
		
	}
}