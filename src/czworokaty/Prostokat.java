package czworokaty;

public class Prostokat {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double obliczPole(){
        return a*b;
    }
}
