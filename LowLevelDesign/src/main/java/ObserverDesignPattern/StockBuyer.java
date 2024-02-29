package ObserverDesignPattern;

/**
 *
 * Concrete Observer
 */
public class StockBuyer implements Observer {
    @Override
    public void update(Subject subject) {
        if(subject instanceof StockPrice){
            StockPrice stockPrice = (StockPrice) subject;
            if(stockPrice.getPrice() > 10){
                System.out.println("Buy stock immediately");
            }
        }

    }
}
