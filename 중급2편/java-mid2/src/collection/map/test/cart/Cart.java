package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        /*
        if(cartMap.containsKey(product)) {
            int quantity = cartMap.get(product) + addQuantity;
        }

        cartMap.put(product, quantity)
         */

        int existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int quantity = existingQuantity - minusQuantity;

        if(quantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, quantity);
        }
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for(Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
