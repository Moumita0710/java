package Package1;
public class Derived extends Protection{
    Derived( int n, int pri_n, int pro_n,  int pub_n){
        super( n, pri_n, pro_n, pub_n);
        System.out.println(n);
        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }

    public static void main(String[] args) {
        Derived d=new Derived(5,6,4,8);
        System.out.println(d.n);
        System.out.println(d.pro_n);
        System.out.println(d.pub_n);
//        private access cannot be accessed in another class even it is in same package.
        //System.out.println(d.pri_n);
    }


}