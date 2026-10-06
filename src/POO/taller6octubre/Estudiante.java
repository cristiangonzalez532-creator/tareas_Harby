package POO.taller6octubre;

public class Estudiante extends Persona {
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    public void presentarse(){
        System.out.println("Mi nombres es " + getNombre() + " mi edad es " + getEdad() + " y estudio " + programa);
    }
}
