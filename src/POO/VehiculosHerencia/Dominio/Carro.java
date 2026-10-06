package POO.VehiculosHerencia.Dominio;

public class Carro {

    private int llantas;
    private String placa;
    private int velocidadactual;

    public Carro(int llantas, String placa, int velocidadactual) {
        this.llantas = llantas;
        this.placa = placa;
        this.velocidadactual = velocidadactual;
    }

    public int getLlantas() {
        return llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVelocidadactual() {
        return velocidadactual;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidadactual(int velocidadactual) {
        this.velocidadactual = velocidadactual;
    }


    public void encender() {
        System.out.println("El carro esta encendido.");
    }


    public void acelerar(int incremento) {
        this.velocidadactual += incremento;
        System.out.println("Acelerando. Velocidad actual: " + this.velocidadactual + " km/h");
    }


    public void frenar() {
        this.velocidadactual = 0;
        System.out.println("El carro se ha detenido.");
    }
}



