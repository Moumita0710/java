import java.util.Locale;

public class Locale_ex2 {
    public static void main(String[] args) {
        Locale enLocale=new Locale("en","US");
        Locale frLocale=new Locale("fr","FR");
        Locale esLocale=new Locale("es","ES");
        System.out.println("English Language name(default):"+enLocale.getDisplayLanguage());
        System.out.println("English language name in French:"+enLocale.getDisplayLanguage(frLocale));
        System.out.println("English language name in Spanish:"+enLocale.getDisplayLanguage(enLocale));
    }
}
