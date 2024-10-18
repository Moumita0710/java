package Stream;

import java.io.FileReader;
import java.io.Reader;

public class Reading {
    public static void main(String[] args) {
        try {
            Reader r=new FileReader("C:\\Users\\Admin\\IdeaProjects\\Java File\\today.txt");
            int data=r.read();
            while(data>=0){
                System.out.println((char)data);
                data=r.read();
            }
            r.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
