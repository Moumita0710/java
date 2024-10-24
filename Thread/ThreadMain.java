package Stream;
class aptechThread1 extends Thread{
    public aptechThread1(String name){
        super(name);
    }

    @Override
    public void run() {
        this.yield();
        try{
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                Thread.sleep(500);
                System.out.println("t1 state-->"+ThreadMain.t1.getState());
                System.out.println("T2 state-->"+ThreadMain.t2.getState());
            }
        }
        catch (Exception e){}

    }
}
class aptechThread2 extends Thread{
    public aptechThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        try{
            for (int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                Thread.sleep(1500);
                System.out.println("T1 state-->"+ThreadMain.t1.getState());
                System.out.println("T2 state-->"+ThreadMain.t2.getState());
            }
        }
        catch (Exception e){}
    }
}
public class ThreadMain {
    static aptechThread1 t1=null;
    static aptechThread2 t2=null;

    public static void main(String[] args) {
        t1=new aptechThread1("Thread1");
        t2=new aptechThread2("Thread2");
        System.out.println("Thread 1 State="+t1.getState());
        System.out.println("Thread 2 State="+t2.getState());
        System.out.println("t1 is alive="+t1.isAlive());
        t1.start();
        System.out.println("t1 is alive="+t1.isAlive());
        t2.start();
        System.out.println("Thread 1 state="+t1.getState());
        System.out.println("Thread 2 state="+t2.getState());


    }
}
