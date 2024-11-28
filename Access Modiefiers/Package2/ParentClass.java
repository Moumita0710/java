package Package2;

import Package1.Protection;

public class ParentClass extends Package1.Protection {
    ParentClass(int n, int pri_n, int pro_n,  int pub_n){
        super( n, pri_n, pro_n, pub_n);
        System.out.println(n);
        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }

    public static void main(String[] args) {
        Protection p1=new Protection(1,2,3,4);
//        friendly access cannot be accesses in other package.
//        System.out.println(p1.n);
//        private access cannot be accesses in other package.
//        System.out.println(p1.pri_n);
//       Protected access cannot be accesses in other package.
//        System.out.println(p1.pro_n);
        System.out.println(p1.pub_n);
    }
}
