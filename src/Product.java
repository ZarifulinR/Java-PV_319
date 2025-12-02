public class Product {
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private String name;

    public void setPrice(double price) {
        if(price <=0){
            System.out.println("Цена не может быть отрицательной");
        }
        else {
            this.price = price;
        }


    }
      public void totalCost(){
        double cost;
        cost=price*quantity;
        System.out.println(cost);
      }
    private double price;
    private final int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
