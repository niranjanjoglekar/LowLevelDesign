package templateDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class OfflineOrder extends PhoneOrder{
    @Override
    void selectProduct() {
        System.out.println("Selecting product from offline store");
    }

    @Override
    void makePayment() {
        System.out.println("Making the payment from offline store");
    }

    @Override
    void deliverProduct() {
        System.out.println("Product delivered in hands at offline store");
    }
}
