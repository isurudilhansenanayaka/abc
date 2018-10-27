public class CriticalSection{
    int turn;
    boolean flag[] = new boolean[2];
    int i=0,j=1;
    int count=0;
    int cscVar=1;
    private class aThread extends Thread{ 
        public void run(){
                try{
                    do{
                        flag[i]= true;
                        turn=j;
                        while(flag[j]&&turn==j);
                        System.out.println("A is in critical section");
                        cscVar++;
                        System.out.println(cscVar);
                        count++;
                        System.out.println("count is "+count+"\n");
                        flag[i]= false;
                      	Thread.sleep(1000);
                    }while(count<15);
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    private class bThread extends Thread{ 
            public void run(){
                try{
                    do{
                        flag[j]= true;
                        turn=i;
                        while(flag[i]&&turn==i);
                        System.out.println("B is in critical section");
                        cscVar--;
                        System.out.println(cscVar);
                        count++;
                        System.out.println("count is "+count+"\n");
                        flag[j]= false;
                      	Thread.sleep(1000);
                    }while(count<15);
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    public CriticalSection(){
        System.out.println("Start Processes");
        Thread a= new aThread();
        Thread b = new bThread();
        
    }
        public static void main(String[] args){
        CriticalSection cSec = new CriticalSection();
    }
}