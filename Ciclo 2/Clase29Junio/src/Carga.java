public class Carga extends Vehiculo {

    public float peso;

    public Carga(int pasajeros, float velocidad, float peso) {
        super(pasajeros, velocidad);
        this.peso = peso;
    }

    @Override //Voy a sobrescribir lo que mi padre está haciendo con el metodo
    public void pintar(int posicion) {
        System.out.println("Pintando carga");
    }
}
