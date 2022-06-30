public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan",16,'H',70,176 );
        Persona p2 = new Persona("Juan",15,70,176 );
        System.out.println(p2);

        Platon p = new Platon(10,80,500);
        Vehiculo v = new Vehiculo(20,50);
        Carga c = new Carga(1,1,1);

        c.pintar(0);
    }
}