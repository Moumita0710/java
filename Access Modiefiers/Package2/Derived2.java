package Package2;

import Package1.Protection;

public class Derived2 extends Package1.Protection {
    Derived2(int n, int pri_n, int pro_n, int pub_n) {
        super(n, pri_n, pro_n, pub_n);
        System.out.println(n);
        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }

    public static void main(String[] args) {
        Derived2 d2 = new Derived2(1, 2, 3, 4);
        //friendly access cannot be accesses in other package.
        // System.out.println(d2.n);
        //private access cannot be accessed in another class even it is in same package.
        //System.out.println(d.pri_n);
        System.out.println(d2.pub_n);
        System.out.println(d2.pro_n);

    }
}