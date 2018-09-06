import java.util.Scanner;
public class Calculator
{
	int n1,n2;
	double value=0;
	public Calculator(int x,int y){
		n1=x;
		n2=y;		
}
	public void Add(){
		value=n1+n2;
}
	
	public void Subtract(){
		value=n1-n2;
}

	
	public void Multiply(){
		value=n1*n2;
}

	
	public void Devide(){
		value=(float)n1/n2;
}
	public double show(){
		return value;
}
	

	public static void main(String[] args){
		
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter your First number: ");
		int q1=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter your Second number: ");
		int q2=s2.nextInt();
		Calculator c1=new Calculator(q1,q2);
		Scanner s3=new Scanner(System.in);
		System.out.print("Enter your oppretor: ");
		String q3=s3.next();
		switch(q3){
			case "+":c1.Add();break;
			case "/":c1.Devide();break;
			case "-":c1.Subtract();break;
			case "*":c1.Multiply();break;
			default : System.out.println("illgel oppretor");
		}

		
		System.out.println(q1+q3+q2+"="+c1.show());

}
}
