//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Transport[] transports=new Transport[3];
    transports[0] = new Transport();
    transports[1]=new Boat();
    transports[2]=new Car();
    for (int i=0;i< transports.length;i++){
        transports[i].move();
    }
    Animal[] animals = new Animal[3];
    animals[0] = new Animal("Животные");
    animals[1] = new Dog("Бобик");
    animals[2]= new Cat("Жужа");
    for (int i=0;i<animals.length;i++){
        animals[i].info();
        animals[i].sound();
    }

}
