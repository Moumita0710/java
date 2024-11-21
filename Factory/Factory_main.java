class Factory{
    public Billing computeBill(String Type){
        if(Type==null){
            return null;
        }
        if(Type.equalsIgnoreCase("DOMESTIC")){
            return new Domestic();
        } else if (Type.equalsIgnoreCase("COMMERCIAL")) {
            return new Commercial();
        } else if (Type.equalsIgnoreCase("INSTITUTIONAL")) {
            return new Institutional();
        }
        return null;
    }
}
 interface Billing{
    void getBill();
}
class Commercial implements Billing{
    @Override
    public void getBill() {
        System.out.println("This is a bill for commercial.");
    }
}
class Domestic implements Billing {
    @Override
    public void getBill() {
        System.out.println("This is a Domestic bill.");
    }
}
class Institutional implements Billing{
    @Override
    public void getBill() {
        System.out.println("This is institutional bill.");
    }
}
public class Factory_main {
    public static void main(String[] args) {
        Factory bill=new Factory();
        Billing bill_1= bill.computeBill("Institutional");
       // Billing bill_1= bill.computeBill("Domestic");
       // Billing bill_1= bill.computeBill("Commercial");

        bill_1.getBill();
    }
}
