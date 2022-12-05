import czworokaty.Kwadrat;
import czworokaty.Prostokat;

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(4, 5);
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println("prostokat");
        System.out.println(prostokat.getA());
        System.out.println(prostokat.getB());
        System.out.println("kwadrat");
        System.out.println(kwadrat.getA());
        System.out.println(kwadrat.getB());
        System.out.println("----------------");
        System.out.println(prostokat.obliczPole());
        System.out.println(kwadrat.obliczPole());
        System.out.println("--------------------");
        System.out.println(kwadrat.obliczPrzekatna());



    }
}