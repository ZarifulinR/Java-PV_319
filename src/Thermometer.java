public class Thermometer {

    private double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        if (temp<=-50 || temp>50){
            System.out.println("\"Температура вне допустимого диапазона\"");
        }

        this.temp = temp;
    }


}
