package Package1;

public class Protection{
    int n=1;
    private int pri_n=2;
    protected int pro_n=3;
    public int pub_n=4;
    public Protection(int n, int pri_n, int pro_n, int pub_n){
        this.n=n;
        this.pri_n=pri_n;
        this.pro_n=pro_n;
        this.pub_n=pub_n;
        System.out.println(n);
        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }

    public static void main(String[] args) {
        Protection p=new Protection(1,2,3,4);
        System.out.println(p.n);
        System.out.println(p.pro_n);
        System.out.println(p.pub_n);
        System.out.println(p.pri_n);

    }
}