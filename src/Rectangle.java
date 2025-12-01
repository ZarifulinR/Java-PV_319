public class Rectangle {
    public double width;
    public double height;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void Area(){
        double area;
        area= width*height;
        System.out.println("Площадь= "+area);

    }
    void Print(){
        System.out.println("Ширина= "+width +" Высота= " +height);
    }

}

