package June_22;
import java.util.Scanner;
public class BillingSystem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter list size:");
        int size=sc.nextInt();
        String product[] = new String[size];
        for(int i=0;i<product.length;i++){
            System.out.println("Enter Product Name:"+(i+1));
            product[i]=sc.next();
        }
        double price[]=new double[size];
        for(int i=0;i< product.length;i++){
            System.out.println("Enter product price"+(i+1));
            price[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i< price.length;i++){
            sum+=price[i];
        }

        System.out.println("Do You Want to add GST [Y/N]");
        char select=sc.next().charAt(0);
                if(select=='Y'||select=='y'){
                    double gst;
                    gst=sum*18/100;
                    System.out.println("-------- Output --------");
                    for (int i = 0; i< product.length; i++) {
                        System.out.println((i + 1) + "\t\t" + product[i] + "\t\t" + price[i]);
                    }
                    System.out.println("-------------------------------");

                    System.out.println("Total="+sum+"/-");
                    System.out.println("Gst = 18%");
                    System.out.println("---------------------------------------");
                    System.out.println("Total amount including gst is="+(sum+gst)+"/-");
                    System.out.println("---------------------------------------");
                }
                else if(select=='N'||select=='n'){
                    System.out.println("-------- Output --------");
                    for (int i = 0; i< product.length; i++) {
                        System.out.println((i + 1) + "\t\t" + product[i] + "\t\t" + price[i]);
                    }
                    System.out.println("-------------------------------");
                    System.out.println("Total="+sum+"/-");
                    System.out.println("-------------------------------");
                }
                else{
                    System.out.println("Invalid!!!");
                }
        }

}

