import java.util.Locale;

public class Localechange {
    public static void main(String[] args) {
        Locale[] locale={new Locale("en","US"),
                new Locale("es","ES"),new Locale("it","IT")};
        for(int i=0;i<locale.length;i++){
            String displayLanguage=locale[i].getDisplayLanguage(locale[i]);
            System.out.println(locale[i].toString()+":"+displayLanguage);
        }

    }
}
