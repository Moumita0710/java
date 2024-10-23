package Stream;

import org.w3c.dom.ls.LSOutput;

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        Thread ob = Thread.currentThread();
        System.out.println(ob);
        System.out.println("alive ="+ob.isAlive());
        ob.setName("Aptech Thread");
        System.out.println("Name:"+ob.getName());
        System.out.println("Priority:"+ob.getPriority());
        for(int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("Have a nice Day!!");
    }
}