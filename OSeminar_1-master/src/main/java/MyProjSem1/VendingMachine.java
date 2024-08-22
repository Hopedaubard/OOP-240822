package MyProjSem1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);


//    public Product getProduct(String name) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                money += product.getPrice();
//                return product;
//            }
//        }
//        return null;
//    }

}
