import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.Area();
        double areaY = y.Area();

        System.out.printf("Triangle area X: %.4f%n", areaX);
        System.out.printf("Triangle area Y: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Larger area X");
        } else {
            System.out.println("Larger area Y");
        }


        sc.close();
    }
}
