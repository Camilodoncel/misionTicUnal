public class Persona {
    public String nombre;
    public  int edad;
    public char genero;
    public float peso;
    public float altura;

    public Persona(String nombre, int edad, char genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = 'x';
    }

    public boolean esMayorDeEdad(int edad){
        return edad >= 18;
    }
}
