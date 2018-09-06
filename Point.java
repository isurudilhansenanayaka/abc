import java.util.Scanner;
public class Point
{
	int x,y;
	double distance=0;
	
	public double GetDistanceFromRoot(int xval,int yval)
	{
;	x=xval;
		y=yval;
		this.distance=Math.sqrt(x*x+y*y);
		return distance;
	}


	
	
	public static void main(String[] args)
	{
		Point p1=new Point();
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter x value : ");
		int x=sc1.nextInt();

		Scanner sc2=new Scanner(System.in);
		System.out.print("Enter y value : ");
		int y=sc2.nextInt();

		System.out.println("Distance from root to ("+ x + ',' + y + ") : "+p1.GetDistanceFromRoot(x,y));
			
		Point p2=new Point();
		Scanner sc3=new Scanner(System.in);
		System.out.print("Enter x value : ");
		int x2=sc3.nextInt();

		Scanner sc4=new Scanner(System.in);              
		System.out.print("Enter y value : ");
		int y2=sc4.nextInt();

		System.out.println("Distance from root to ("+ x2 + ',' + y2 + ") : "+p2.GetDistanceFromRoot(x2,y2));		

		double dis_p1_p2=Math.sqrt(Math.pow((p1.y-p2.y),2)+Math.pow((p1.x-p2.x),2));
		System.out.println("Distance between two point : "+dis_p1_p2);
		
	}
}
