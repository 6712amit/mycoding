import java.util.Scanner;
class AreaTriangle
{
	public static void main(String args[])
	{
		double area,a,b,c,s;
		System.out.println("enter the sides of a triangle");
		Scanner in=new Scanner(System.in);
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of triangle is="+area);
		
		
	}
}