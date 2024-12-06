import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(3333);
        Socket s=ss.accept();
        //put the server into the listening mode so that it can listen to the requests
        //coming from the client-side at the port number that we binded in the last step.
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
       Scanner sc=new Scanner(System.in);
        String str="",str2="";
        while (!str.equals("stop")){
            str=din.readUTF();
            System.out.println("client says:"+str);
            str2=sc.next();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}
