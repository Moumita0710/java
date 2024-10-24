package Stream;
class Xyz{
    int x;
    int y;
    Xyz(){
        x=8;
        y=40;
    }
    Xyz(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Xyz{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Abc extends Xyz{
    Abc(){

    }
    Abc(int x, int y){
        super(x,y);
        System.out.println("in Abc");
    }
}
public class Constructor {
    public static void main(String[] args) {
       // Abc ob=new Abc();
         Abc ob=new Abc(21,45);
        System.out.println(ob);
    }
}
