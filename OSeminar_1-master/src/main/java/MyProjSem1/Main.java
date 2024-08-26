package MyProjSem1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater("Voljanka", 10,1);
        System.out.println(product1);
        Product product2 = new HotDrink("Mac", 5,1,40);
        Product product3 = new HotDrink("Mix", 6,1,50);
        Product product4 = new HotDrink("Rocks", 3,1,60);
        ArrayList<Product> hotDrinks = new ArrayList<>(List.of(product2,product3,product4));
        VendingMachine hotDrinkMachine = new HotDrinkVendingMachine(hotDrinks);
        System.out.println(hotDrinkMachine.getProduct("Mac"));
        System.out.println(hotDrinkMachine.getProduct("Rocks"));
    }
}
