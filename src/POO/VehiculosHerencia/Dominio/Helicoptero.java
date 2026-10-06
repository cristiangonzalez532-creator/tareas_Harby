package POO.VehiculosHerencia.Dominio;

public class Helicoptero {
    private String modelo;
    private String matricula;
    private int velocidadActual;

    public Helicoptero(String modelo, String matricula, int velocidadActual) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidadActual = velocidadActual;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public void encenderRotores() {
        System.out.println("Las hélices del helicóptero han comenzado a girar.");
    }


    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Aumentando velocidad de vuelo. Velocidad actual: " + this.velocidadActual + " km/h");
    }


    public void aterrizar() {
        this.velocidadActual = 0;
        System.out.println("El helicóptero ha aterrizado y detenido sus hélices.");
    }

}
