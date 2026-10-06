package POO.VehiculosHerencia.Dominio;

public class Lancha {
    private String marca;
    private int potenciaCF;
    private int velocidadActual;

    public Lancha(String marca, int potenciaCF, int velocidadActual) {
        this.marca = marca;
        this.potenciaCF = potenciaCF;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotenciaCF() {
        return potenciaCF;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotenciaCF(int potenciaCF) {
        this.potenciaCF = potenciaCF;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void encenderMotor() {
        System.out.println("El motor fuera de borda de la lancha ha sido encendido.");
    }

    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        System.out.println("Navegando a mayor velocidad. Velocidad actual: " + this.velocidadActual + " nudos");
    }

    public void atracar() {
        this.velocidadActual = 0;
        System.out.println("La lancha ha bajado su velocidad y se ha detenido en el puerto.");
    }
}
