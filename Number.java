class Number{
	static int num=0;
	public void incre(){
		num++;
	}public void incre(int n){
		num+=n;
	}
	public void dec(){
		num--;
	}public void dec(int n){
		num-=n;
	}
	public void neg(){
		num*=-1;
	}
	public int show(){
		return num;
	}
	public class opp extends Number{
		int z;
		public void add(int x,int y){
			z=x+y;
		}
		public void mul(int x,int y){
			z=x*y;
		}
		public int show(){
			return z;
		}
	}
	public static void main(String[] args) {
		Number n1=new Number();
		n1.incre();
		
		System.out.println(n1.show());
		Number n2=new Number();
		n2.dec(8);
		
		System.out.println(n2.show());
		
		}

}