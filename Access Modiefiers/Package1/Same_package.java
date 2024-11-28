package Package1;

public class Same_package{
    Same_package(int n, int pri_n, int pro_n,  int pub_n){
        //super( n, pri_n, pro_n, pub_n);
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
        //private access cannot be accessed in another class even it is in same package.
        //System.out.println(d.pri_n);
    }

}