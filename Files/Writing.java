package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Writing {
    public static void main(String[] args) {
        try{
            Writer w=new FileWriter("C:\\wUsers\\Admin\\IdeaProjects\\Java File\\today.txt");
            String data="Every people love their own counrty";
            w.write(data);
            w.close();
            System.out.println("Succesfully written...");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
