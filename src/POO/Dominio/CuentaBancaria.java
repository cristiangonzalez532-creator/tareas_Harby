package POO.Dominio;

public class CuentaBancaria {
    public String numero;
    public double saldo;
    public String contrasena;
    public String tipo;
    public Persona titular;
    public Banco banco;

    public CuentaBancaria(String numero, double saldo, String contrasena, String tipo, Persona titular, Banco banco) {
        this.numero = numero;
        this.saldo = saldo;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.titular = titular;
        this.banco = banco;

    }
    public void depositar(double cantidad){
        // forma larga   this.saldo = this.saldo + cantidad;
        this.saldo += cantidad;
    }

    public void retiro(double cantidad){
        if(saldo >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("saldo insuficiente");
        }

    }

    public void transferir(CuentaBancaria cuentaBancaria, double cantidad){
        retiro(cantidad);
        cuentaBancaria.depositar(cantidad);
        System.out.println("transferencia exitosa ");

    }
    public void mostrarInformacion(){
        System.out.println(saldo + numero + titular + banco );
    }


}

