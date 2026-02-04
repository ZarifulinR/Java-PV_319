void main() {
    Printer printer =new Printer();
    Thread thred1 = new Thread(()->printer.print("Yahoo"));
    Thread thred2 = new Thread(()->printer.print("Yandex"));
    thred1.start();
    thred2.start();

}