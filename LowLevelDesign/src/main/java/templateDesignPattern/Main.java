package templateDesignPattern;

/**
 * @author niranjanjoglekar on 03/03/24
 */
public class Main {

    public static void main(String[] args) {
        PhoneOrder offlineStore = new OfflineOrder();
        offlineStore.createOrder();
        System.out.println();
        PhoneOrder onlineStore = new OnlineOrder();
        onlineStore.createOrder();
    }
}
