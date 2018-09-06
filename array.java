import java.util.Scanner;
public class array{
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int b=in.nextInt();
		int a=in.nextInt();
		int []arr2=new int[b];
		int []arr=new int[a];
		
		
		for (int i=0;i<b ;i++ ) {
			System.out.print("Num " +(i+1)+" : ");
			arr[i]=in.nextInt();

		}
		
		for (int k=0;k<a ;k++ ) {
			System.out.print("Num " +(k+1)+" : ");
			arr2[k]=in.nextInt();

		}
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=0;j<arr2.length ;j++ ) {
				if (arr[i]==arr2[j]) {
					System.out.print(arr[i]);;
				}
			}
		}
		
	}
}