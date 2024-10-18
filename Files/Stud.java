package Stream;

import java.io.*;

class Ser_stud implements Serializable {
    int roll_no;
    String name;

    Ser_stud() {

    }

    Ser_stud(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    void show() {
        System.out.println("Roll no:" + roll_no);
        System.out.println("name;" + name);
    }
}
    public class Stud{
        public static void main(String[] args) throws IOException, ClassNotFoundException {
//            FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\Java File\\today.txt");
//            ObjectOutputStream out=new ObjectOutputStream(fout);
//            Ser_stud ob=new Ser_stud(1,"Moumita");
//            out.writeObject(ob);
//            out.close();
//            fout.close();
            FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Java File\\today.txt");
            ObjectInputStream in=new ObjectInputStream(fin);
            Ser_stud ob=new Ser_stud();
            Ser_stud s=(Ser_stud) in.readObject();
            s.show();
        }
    }

