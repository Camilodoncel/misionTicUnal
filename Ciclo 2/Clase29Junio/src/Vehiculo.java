public class Vehiculo {
    public int pasajeros;
    public float velocidad;

    public Vehiculo(int pasajeros, float velocidad) {
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }

    public void pintar(int posicion){
        System.out.println("Pintando vehiculo");
    }
}
