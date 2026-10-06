package POO.VehiculosHerencia.APP.App;

import POO.VehiculosHerencia.Dominio.Carro;

public class vehiculo {

public static void main (String[] args){

    Carro micarro = new Carro (4, "xnxx", 80);
    micarro.encender();
    micarro.acelerar(10);
    micarro.frenar();
}
}




