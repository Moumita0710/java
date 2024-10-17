package ComparableEx;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;

public class ComparableMain {
    public static void main(String[] args) {
        List<CompClass>ob=new ArrayList<CompClass>();
        ob.add(new CompClass("M",2,12));
        ob.add(new CompClass("o",1,5));
        ob.add(new CompClass("U",4,67));
        Collections.sort(ob);
        for(CompClass c:ob){
            System.out.println(c);
        }

    }
}
