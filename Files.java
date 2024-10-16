package Stream;
import java.io.*;
import java.io.File;
public class Files {
    public static void main(String[] args) throws IOException {
//        File ob=new File("today.txt");
//        if(ob.createNewFile()){
//            System.out.println("creating new file");
//        }
//        else{
//            System.out.println("file already exist");
//        }
//        System.out.println(ob.exists());
//        System.out.println(ob.getAbsolutePath());
//        System.out.println(ob.getName());
//        System.out.println(ob.getParent());
//        System.out.println(ob.getPath());


//        File ob = new File("C:\\Users\\Admin\\IdeaProjects\\Java File");
//        System.out.println(ob.isDirectory());
//        System.out.println(ob.isFile());
//        String files[] = ob.list();
//        System.out.println("All Files");
//        for (String name : files) {
//            System.out.println(name);
//        }
//        System.out.println("Directory\t\tFiles");
//        File fileob[] = ob.listFiles();
//        for (File ob1 : fileob) {
//            if (ob1.isDirectory())
//                System.out.println("Dir------" + ob1);
//            else
//                System.out.println("files--->\t\t" + ob1);
//        }

        File ob = new File("C:\\Users\\Admin\\IdeaProjects\\Java File");
        String files[]=ob.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String str) {
                if(str.toLowerCase().endsWith(".txt"))
                    return true;
                else
                    return false;
            }
        });
        for(String s:files){
            System.out.println(s);
        }
    }
}
