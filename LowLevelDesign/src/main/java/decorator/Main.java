package decorator;

/**
 * @author niranjanjoglekar on 27/02/24
 */
public class Main {
    public static void main(String[] args) {

        BasePizza farmHouse = new FarmHouse();
        System.out.println("Farmhouse : "+farmHouse.cost());

        BasePizza jalapenoFarmHouse = new Jalapeno(farmHouse);
        System.out.println("Jalapeno Farmhouse : "+jalapenoFarmHouse.cost());

        BasePizza mushroomJalapenoFarmHouse = new Mushroom(jalapenoFarmHouse);
        System.out.println("Mushroom Jalapeno Farmhouse : "+mushroomJalapenoFarmHouse.cost());
    }
}
