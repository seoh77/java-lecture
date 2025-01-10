package access.ex;

public class ShoppingCart {
    Item[] cart = new Item [10];
    int size = 0;

    public void addItem(Item item){
        if(size >= 10) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
        cart[size++] = item;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");

        for (int i=0; i<size; i++) {
            Item item = cart[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합: " +  calculateTotalPrice());
    }

    // displayItems() 내부에서 처리할 수도 있지만 따로 메서드 분리하는게 더 깔끔하다.
    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i<size; i++) {
            Item item = cart[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }
}
