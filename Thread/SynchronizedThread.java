package Stream;
class Msgblock{
  //Synchronized Method--> synchronized void showmsg(String arr[]){
    void showmsg(String arr[]){
        //Synchronized block
        synchronized (this){
            System.out.print("[");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
                try{
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }
            System.out.println("!");
        }
    }
}
class MsgThreadDemo extends Thread{
    Msgblock m;
    String arr[];
    public MsgThreadDemo(Msgblock m,String arr[]){
        this.m=m;
        this.arr=arr;
        start();
    }
    public void run(){
        m.showmsg(arr);
    }
}
public class SynchronizedThread {
    public static void main(String[] args) {
        String arr1[]={"I ", "am ", "working " , "in " , "Synchronized " , "block. "};
        String arr2[]={"Have ","a ","nice ","Day!!! "};
        Msgblock msg=new Msgblock();
        MsgThreadDemo t1=new MsgThreadDemo(msg,arr1);
        MsgThreadDemo t2=new MsgThreadDemo(msg,arr2);
    }
}
