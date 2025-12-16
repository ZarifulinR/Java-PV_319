public record Product(String name , double price) {
    public Product(String name , double price) {
        if(name == null || price<0)
            throw new IllegalArgumentException("Цна не может быть Отрицательной !");
        this.name=name;
        this.price=price;
    }
}
