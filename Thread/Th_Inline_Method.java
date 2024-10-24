package Stream;

public class Th_Inline_Method {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                try{
                    for (int i=1;i<=2;i++) {
                        System.out.println("Hello");
                        Thread.sleep(500);
                    }
                }
                catch (Exception e){

                }
            }
        };
        Thread ob1=new Thread(r);
        ob1.start();
    }
}
