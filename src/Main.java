//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Transport[] transports=new Transport[3];
    transports[0] = new Transport();
    transports[1]=new Boat();
    transports[2]=new Car();
    for (Transport transport : transports) {
        transport.move();
    }
    Animal[] animals = new Animal[3];
    animals[0] = new Animal("Животные");
    animals[1] = new Dog("Бобик");
    animals[2]= new Cat("Жужа");
    for (Animal animal : animals) {
        animal.info();
        animal.sound();
    }
    ZooAnimal[] ZooAn = new ZooAnimal[2];
    ZooAn[0]= new Elephant("Вадим");
    ZooAn[1] = new Monkey("Masha");
    for(int i =0;i<ZooAn.length;i++) {
        ZooAn[i].makeSound();
    }
    EmailNotification email = new EmailNotification("123" , "masha@dasha.ru");
    email.send();
    email. printInfo();


}
