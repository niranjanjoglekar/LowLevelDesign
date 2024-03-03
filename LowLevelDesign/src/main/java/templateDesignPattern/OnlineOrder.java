package templateDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class OnlineOrder extends PhoneOrder{
    @Override
    void selectProduct() {
        System.out.println("Selecting product from online store");
    }

    @Override
    void makePayment() {
        System.out.println("Making the payment from online store");
    }

    @Override
    void deliverProduct() {
        System.out.println("Product delivered at selected address");
    }
}
