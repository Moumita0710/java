package Generators;

class GenericFunction {
    <T> void show(T a, T b){
        System.out.println(a+""+b);
    }
}
public class GenericFunctionOverloading{
    public static void main(String[] args) {
        GenericFunction obj=new GenericFunction();
        obj.show(4,5);
        obj.show("Moumita", "Onkita");
        obj.show(1.2,4.6);
    }

}