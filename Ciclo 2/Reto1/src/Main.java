import java.util.Scanner;

public class Main {

    public static int distanciaProximaEsfera( int distanciaCasaGoku){
        return (distanciaCasaGoku * 2)+4;
    };

    public static int duracionViaje(int distanciaCasaGoku, int distanciaProximaEsfera){
        return (distanciaCasaGoku + distanciaProximaEsfera)/5;
    };

    public static String numeroEsfera(int duracionViaje){

        String numeroEsfera = "";
        if(duracionViaje <= 20){
          System.out.println("uno");
        } else if (duracionViaje <= 30) {
            System.out.println("dos");
        } else if (duracionViaje <= 50) {
            System.out.println("tres");
        } else System.out.println("cuatro");
        return numeroEsfera;
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la distancia a casa de Goku: ");
        int distanciaCasaGoku = Integer.parseInt(input.nextLine());
        int distanciaProximaEsfera = distanciaProximaEsfera(distanciaCasaGoku);
        int duracionViaje = duracionViaje(distanciaCasaGoku, distanciaProximaEsfera);
        System.out.println(distanciaCasaGoku + " " + distanciaProximaEsfera + " " + duracionViaje);
        String numeroEsfera = numeroEsfera(duracionViaje);
    }
}