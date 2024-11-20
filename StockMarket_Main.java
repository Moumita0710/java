import java.util.ArrayList;
import java.util.List;

interface StockMarket{
    void registerObserver(StockObserver o);
    void removeObserver(StockObserver o);
    void notifyObserver(String stockSymbol, double stockPrice);
    void setStockPrice(String stockSymbol,double stockPrice);
}
interface StockObserver{
    void update(String stockSymbol, double stockPrice);
}
class StockMarketImpl implements StockMarket{
    private List<StockObserver> observers=new ArrayList<>();

    @Override
    public void registerObserver(StockObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(StockObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String stockSymbol, double stockPrice) {
        for(StockObserver observer:observers){
            observer.update(stockSymbol,stockPrice);
        }
    }
    public void setStockPrice(String stockSymbol,double stockPrice){
        notifyObserver(stockSymbol,stockPrice);
    }
}
class Investor implements StockObserver{
    private String name;
    public Investor(String name){
        this.name=name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name+" received an update for "+stockSymbol+":$"+stockPrice);
    }
}
public class StockMarket_Main {
    public static void main(String[] args) {
        StockMarket stockMarket=new StockMarketImpl();
        StockObserver investor1=new Investor("Alice");
        StockObserver investor2=new Investor("Bob");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setStockPrice("INFY",1250.0);
        stockMarket.setStockPrice("TCS",2500.0);

        stockMarket.removeObserver(investor1);
        
        stockMarket.setStockPrice("WIPRO",700.0);

    }
}
