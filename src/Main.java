//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    User Ivan = new User("Ivan",23);
    User Fedor = new User("Fedor",23);
    System.out.println(Ivan.equals(Fedor));
    System.out.println(Ivan.toString());
    System.out.println(Fedor.toString());

    try {
        Product TV = new Product("TV", 100);
        System.out.println(TV);
        Product PS= new Product("PS", -5);
        System.out.println(PS);
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }
    List<OrderItem> chek = new ArrayList<>();
    chek.add(new OrderItem("Banana", 2, 150));
    chek.add(new OrderItem("Aple", 4, 250));
    chek.add(new OrderItem("Orange", 5, 500));

    double totalSum = chek.stream()
            .mapToDouble(OrderItem::totalPrice)
            .sum();

    System.out.println("Общая стоимость: " + totalSum);

    OrderItem maxItem = chek.stream()
            .max(Comparator.comparingDouble(OrderItem::totalPrice))
            .orElse(null);

    System.out.println(maxItem);


}
