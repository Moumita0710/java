import java.io.*;
import java.io.BufferedReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",3333);
        //here I am using "localhost' because our server and the client applications are present on the same machine
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String str="",str2="";
        while(!str.equals("stop")){
            str=sc.next();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server says:"+str2);
        }

    }
}
