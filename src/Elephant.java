public  class  Elephant extends ZooAnimal {
    String name;
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Ехай б....");
    }
}
