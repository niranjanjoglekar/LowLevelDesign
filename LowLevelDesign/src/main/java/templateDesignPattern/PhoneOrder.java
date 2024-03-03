package templateDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public abstract class PhoneOrder {
    /**
     * This is template Method: Steps in strict same order.
     */
    public final void createOrder(){
        selectProduct();
        makePayment();
        packProduct();
        deliverProduct();
    }

    abstract void selectProduct();
    abstract void makePayment();
    void packProduct(){
        System.out.println("Product is packed");
    }
    abstract void deliverProduct();
}
