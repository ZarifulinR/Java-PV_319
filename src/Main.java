//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello world");
    Point Point = new Point(10,20);
    Point.Print();
    Rectangle Rect =new Rectangle();
    System.out.println("Введите ширину прямоугольника");
    Scanner scanner = new Scanner(System.in);
    Rect.width = scanner.nextDouble();
    System.out.println("Введите высоту прямоугольника");
    Rect.height = scanner.nextDouble();
    Rect.Print();
    Rect.Area();
}
