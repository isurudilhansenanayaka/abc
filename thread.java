class myThread extends Thread{
    private int process;

    myThread(int process){
        this.process = process;
    }

    private void  entrySection(){
        int other = 1 - process;
        programme.flag[process]=true;
        programme.turn = process;


        while (programme.flag[other]&&programme.turn==this.process) 
		System.out.println("Programme "+process+" Can't Access to the programme");
    }
		

    private void exitSection(){
        programme.flag[process]=false;
    }

    @Override
    public void run() {
        entrySection();
        try {
            sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exitSection();
    }
}

public class programme {
    static int turn;
    private static int process=2;
    static boolean flag[] = new boolean[process];

    
    

    public static void main(String args[]){

        

        myThread first = new myThread(0);
        myThread second = new myThread(1);

        second.start();
        first.start();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
