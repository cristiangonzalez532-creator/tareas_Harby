package POO.taller6octubre;

public class Presentacion
{
    public static void main(String[] args){
        Estudiante Cristian = new Estudiante("Cristian", 19, "biologia");

        Profesor David = new Profesor(" David ", 37, " programacion ");

        Cristian.presentarse();
        David.presentarse();

    }
}
