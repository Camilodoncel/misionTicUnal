import java.util.Scanner;

public class Main {

    public static double funcionDoble(double x){
        return x * x;
    };

    public static void main(String[] args) {
        int a = 1;
        int b = ++ a;
        System.out.println(a);
        System.out.println(b);
        //de real a entero
        double c = 6.6;
        int p = (int)c;
        System.out.println(p);

        int i,j,k = 1;

        i = k + 1;
        j = 2 * k;
        i = i * k * j;
        j = j * k - i;
        System.out.println(i);
        System.out.println(j);
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double d = Double.parseDouble(input.nextLine());
        //int k = Integer.parseInt(input.nextLine());
        System.out.println(funcionDoble(d));
    }
}