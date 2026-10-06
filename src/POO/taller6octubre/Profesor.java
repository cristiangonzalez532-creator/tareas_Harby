package POO.taller6octubre;

public class Profesor  extends Persona{

    private String materia;

    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void presentarse(){
        System.out.println("soy el profesor " + getNombre() + " mi edad es " + getEdad() + " y  a continuacion les dare " + materia);
    }
}
