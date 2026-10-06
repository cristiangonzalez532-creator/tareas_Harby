package POO.VehiculosHerencia.Dominio;

public class Moto {
    private String marca;
    private int cilindraje;
    private int velocidadActual;

    public Moto(String marca, int cilindraje, int velocidadActual) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void encender() {
        System.out.println("El motor de la moto ha sido encendido.");
    }


    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Acelerando moto. Velocidad actual: " + this.velocidadActual + " km/h");
    }

    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("La moto se ha detenido.");
    }
}
