package POO.VehiculosHerencia.Dominio;

public class Bicicleta {

    private String marca;
    private int numeroMarchas;
    private int velocidadActual;

    public Bicicleta(String marca, int numeroMarchas, int velocidadActual) {
        this.marca = marca;
        this.numeroMarchas = numeroMarchas;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void pedalear() {
        System.out.println("Comenzando a pedalear la bicicleta.");
    }


    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Pedaleando más rápido. Velocidad actual: " + this.velocidadActual + " km/h");
    }

    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("La bicicleta se ha detenido por completo.");
    }
}

