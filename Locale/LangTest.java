import java.util.Locale;
import java.util.ResourceBundle;

public class LangTest {
    public static void main(String[] args) {
        int lang=2;
        Locale loc;
        if(lang==1){
            System.out.println("english");
            loc=new Locale("en","US");
        }
        else{
            System.out.println("French");
            loc=new Locale("fr","FR");
        }
       // Locale loc2;
        ResourceBundle bundle= ResourceBundle.getBundle("Resource",loc);
        System.out.println(bundle.getString("Greeting"));
        System.out.println(bundle.getString("course"));
//        ResourceBundle bundle2=ResourceBundle.getBundle("Resource",loc2);
//        System.out.println("Greeting in french");
//        System.out.println(bundle2.getString("greeting"));
//
    }
}
