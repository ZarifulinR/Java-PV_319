public class Cat extends Animal {
    String name;

    Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Кошка мяукает");
    }

}
