import java.util.Scanner;
import java.util.Arrays;

class MatrixTest {
    
    public static void main(String args[]){
        
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter diamentions of the 1st metrix: ");
        String dia = sn.nextLine();
        String units[] = dia.split(" ");

        Matrix m1 = new Matrix(Integer.parseInt(units[0]),Integer.parseInt(units[1]));
        m1.read();
        m1.print();
        
        System.out.print("\nEnter diamentions of the 2nd metrix: ");
        dia = sn.nextLine();
        units = dia.split(" ");
        
        Matrix m2 = new Matrix(Integer.parseInt(units[0]),Integer.parseInt(units[1]));
        m2.read();
        m2.print();
        
        Matrix m3 = Matrix.add(m1, m2);
      //  if(m3!=null)
        m3.print();

    }//main()

}//class

class Matrix {

   int row, col, matrix[][];
   
   Matrix(){
   }

   Matrix(int r,int c){ 
       row = r;
       col = c;
       matrix = new int[row][col];
   }
   void read() {
       Scanner sn = new Scanner(System.in);
       for (int i=0; i<row; i++) {
           for (int j=0;j<col; j++) {
               System.out.print("Enter the element [" + i + "][" + j + "]: ");
               matrix[i][j] = sn.nextInt();
           }
       }
   }

   void print() {
       System.out.println();
       for (int i=0; i<row; i++) 
           System.out.println(Arrays.toString(matrix[i]));
       System.out.println();
           
   }
   
      void addElement(int r, int c, int val) {
               matrix[r][c] = val;
   }
      
     int getElement(int r, int c) {
               return matrix[r][c];
   }
   
   static Matrix add(Matrix a, Matrix b) {
       if(a.row!=b.row || a.col!=b.col) {
           System.out.println("Can NOT add these two matrices due to different diamentions.\n");
           return null;
       }
       Matrix m = new Matrix (a.row, a.col);
       for (int i=0; i<m.row; i++) {
           for (int j=0;j<m.col; j++) {
               m.addElement(i, j, (a.getElement(i, j))+b.getElement(i, j));
           }
       }
       return m;
   }//add()
   
      static Matrix multiply(Matrix a, Matrix b) {
       if(a.col!=b.row) {
           System.out.println("Can NOT multiply these two matrices due diamention compatibilities");
           return null;
       }
       Matrix m = new Matrix (a.row, b.col);
       //multiplication
       
       return m;
   }//multiply()
      
}//class Martix
