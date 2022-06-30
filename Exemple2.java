import java.util.Locale;

public class Exemple2 {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.printf("%.2f\n",x);

        String name = "Maria";
        int age = 31;
        double rent = 4000.0d;

        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("Result = " + x + " metros%n");
        System.out.printf("Result = %.2f metros%n", x);

        System.out.printf("%s have %d year old and own $ %.0f monthly\n", name, age, rent);




    }
}
