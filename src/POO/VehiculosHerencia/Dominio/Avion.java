package POO.VehiculosHerencia.Dominio;

public class Avion {
    private String modelo;
    private String matricula;
    private int velocidadActual;

    public Avion(String modelo, String matricula, int velocidadActual) {
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

    public void encender() {
        System.out.println("Motores del avión encendidos y listos para despegar.");
    }


    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Aumentando velocidad. Velocidad actual: " + this.velocidadActual + " km/h");
    }


    public void aterrizar() {
        this.velocidadActual = 0;
        System.out.println("El avión ha aterrizado y se ha detenido por completo.");
    }
}


