package June_22;

public class InheritanceEx {
    String name;
    int age;
    InheritanceEx(String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Inheritance2 extends InheritanceEx{
    String std;
    char div;
    int roll_no;
    Inheritance2(String name, int age,String std,char div,int roll_no){
        super(name, age);
        this.std=std;
        this.div=div;
        this.roll_no=roll_no;
    }

    public static void main(String[] args) {
        Inheritance2 in=new Inheritance2("Moumita",19,"TYIT",'C',133);
        System.out.println(in.name);
        System.out.println(in.age);
        System.out.println(in.std);
        System.out.println(in.div);
        System.out.println(in.roll_no);

    }
}
