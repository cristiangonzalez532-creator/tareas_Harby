package POO;

import POO.Banco.App.Appbanco;
import POO.Dominio.Banco;
import POO.Dominio.CuentaBancaria;
import POO.Dominio.Persona;

public class Main {
    public static void main(String[] args) {
        Carro logan = new Carro("renault", 2015, "automovil", "xyz789", "bogota", 1600, "mecanica", "gasolina", 4, "carlos");
        Carro mazda3 = new Carro("mazda", 2018, "automovil", "abc123", "medellin", 2000, "automatica", "gasolina", 4, "laura");
        Carro sandero = new Carro("renault", 2016, "automovil", "def456", "cali", 1400, "mecanica", "gasolina", 5, "andres");
        Carro fiesta = new Carro("ford", 2014, "automovil", "ghi789", "barranquilla", 1600, "automatica", "gasolina", 4, "sofia");
        Carro corolla = new Carro("toyota", 2020, "automovil", "jkl012", "pereira", 1800, "automatica", "hibrido", 4, "mateo");
        Carro sparkgt = new Carro("chevrolet", 2017, "automovil", "mno345", "bucaramanga", 1200, "mecanica", "gasolina", 4, "valentina");
        Carro sail = new Carro("chevrolet", 2013, "automovil", "pqr678", "manizales", 1400, "mecanica", "gasolina", 4, "camilo");
        Carro twingo = new Carro("renault", 2008, "automovil", "stu901", "armenia", 1200, "mecanica", "gasolina", 2, "lucia");
        Carro picanto = new Carro("kia", 2019, "automovil", "vwx234", "ibague", 1250, "mecanica", "gasolina", 5, "felipe");
        Carro duster = new Carro("renault", 2021, "camioneta", "yza567", "cucuta", 2000, "mecanica", "gasolina", 5, "mariana");
        Carro tucson = new Carro("hyundai", 2018, "camioneta", "bcd890", "pastDriven", 2000, "automatica", "gasolina", 5, "santiago");
        Carro tracker = new Carro("chevrolet", 2022, "camioneta", "efg123", "villavicencio", 1200, "automatica", "gasolina", 5, "daniel");
        Carro kwid = new Carro("renault", 2020, "automovil", "hij456", "monteria", 1000, "mecanica", "gasolina", 5, "gabriela");
        Carro march = new Carro("nissan", 2017, "automovil", "klm789", "neiva", 1600, "mecanica", "gasolina", 5, "nicolas");
        Carro gol = new Carro("volkswagen", 2015, "automovil", "nop012", "popayan", 1600, "mecanica", "gasolina", 5, "isabella");
        Carro swift = new Carro("suzuki", 2021, "automovil", "qrs345", "tunja", 1200, "mecanica", "hibrido", 5, "juan");
        Carro rio = new Carro("kia", 2018, "automovil", "tuv678", "florencia", 1400, "automatica", "gasolina", 4, "samuel");
        Carro versa = new Carro("nissan", 2022, "automovil", "wxy901", "yopal", 1600, "automatica", "gasolina", 4, "alessandra");
        Carro onyx = new Carro("chevrolet", 2021, "automovil", "zab234", "sincelejo", 1000, "mecanica", "gasolina", 4, "diego");
        Carro hilux = new Carro("toyota", 2019, "camioneta", "cde567", "riohacha", 2400, "mecanica", "diesel", 4, "esteban");
        Carro ranger = new Carro("ford", 2020, "camioneta", "fgh890", "quibdo", 3200, "automatica", "diesel", 4, "alejandro");
        Carro cx5 = new Carro("mazda", 2022, "camioneta", "ijk123", "santa marta", 2500, "automatica", "gasolina", 5, "paula");
        Carro sportage = new Carro("kia", 2021, "camioneta", "lmn456", "valledupar", 2000, "automatica", "gasolina", 5, "miguel");
        Carro jetta = new Carro("volkswagen", 2016, "automovil", "opq789", "envigado", 2000, "automatica", "gasolina", 4, "veronica");
        Carro civic = new Carro("honda", 2019, "automovil", "rst012", "sabaneta", 1500, "automatica", "gasolina", 4, "kevin");
        Carro sentra = new Carro("nissan", 2020, "automovil", "uvw345", "palmira", 2000, "automatica", "gasolina", 4, "sara");
        Carro amarok = new Carro("volkswagen", 2018, "camioneta", "xyz678", "soacha", 2000, "mecanica", "diesel", 4, "ricardo");
        Carro k2500 = new Carro("kia", 2017, "camion", "abc901", "itagui", 2500, "mecanica", "diesel", 2, "gonzalo");
        Carro prado = new Carro("toyota", 2021, "camioneta", "def234", "chía", 4000, "automatica", "gasolina", 5, "fernando");
        Carro leaf = new Carro("nissan", 2022, "automovil", "ghi567", "bogota", 0, "automatica", "electrico", 5, "elena");

        // 4 Estrellas Violetas
        Estrella pollux = new Estrella("violeta", 5, "pequeno", 10, 85);
        Estrella castor = new Estrella("violeta", 6, "mediano", 12, 90);
        Estrella bellatrix = new Estrella("violeta", 8, "grande", 16, 95);
        Estrella saiph = new Estrella("violeta", 5, "mediano", 10, 70);

        // 4 Estrellas Doradas
        Estrella achernar = new Estrella("dorado", 5, "grande", 10, 100);
        Estrella hadar = new Estrella("dorado", 6, "pequeno", 12, 75);
        Estrella acrux = new Estrella("dorado", 8, "mediano", 16, 88);
        Estrella mimosa = new Estrella("dorado", 5, "grande", 10, 92);

        // 4 Estrellas Plateadas
        Estrella alnitak = new Estrella("plateado", 5, "mediano", 10, 80);
        Estrella alnilam = new Estrella("plateado", 6, "grande", 12, 98);
        Estrella mintaka = new Estrella("plateado", 8, "pequeno", 16, 65);
        Estrella alioth = new Estrella("plateado", 5, "mediano", 10, 85);

        // 4 Estrellas Turquesas
        Estrella mizar = new Estrella("turquesa", 5, "pequeno", 10, 75);
        Estrella alkaid = new Estrella("turquesa", 6, "mediano", 12, 82);
        Estrella dubhe = new Estrella("turquesa", 8, "grande", 16, 91);
        Estrella merak = new Estrella("turquesa", 5, "pequeno", 10, 68);

        // 4 Estrellas Naranjas
        Estrella hamal = new Estrella("naranja", 5, "grande", 10, 95);
        Estrella algol = new Estrella("naranja", 6, "mediano", 12, 87);
        Estrella mirfak = new Estrella("naranja", 8, "pequeno", 16, 73);
        Estrella enif = new Estrella("naranja", 5, "grande", 10, 89);



        System.out.println(mizar.color + mizar.puntas + mizar.tamano+ mizar.esquina+ mizar.brillo);








    }

    // appbanco
Appbanco bancolombia = new Appbanco("Bancolombia personas", 3.12 , "Grupo bancolombia");
Appbanco appNequi = new Appbanco("Nequi", 4.80, "Bancolombia");
Appbanco appDavivienda = new Appbanco("Davivienda Colombia", 3.45, "Banco Davivienda");
Appbanco appNu = new Appbanco("Nu Colombia", 4.70, "Nu Holdings");
Appbanco appBbva = new Appbanco("BBVA Colombia", 3.80, "Grupo BBVA");

// personas


Persona persona1 = new Persona("Carlos Mendoza", "1017245890", "carlos.mendoza@email.com", 28);
Persona persona2 = new Persona("Ana María Gómez", "1036985214", "ana.gomez@email.com", 34);
Persona persona3 = new Persona("David Restrepo", "1152439876", "david.restrepo@email.com", 22);
Persona persona4 = new Persona("Laura Sofía Torres", "1020456789", "laura.torres@email.com", 29);
Persona persona5 = new Persona("Mateo Jaramillo", "1037654321", "mateo.jaramillo@email.com", 41);
Persona persona6 = new Persona("Valentina Ríos", "1015987654", "valentina.rios@email.com", 25);
Persona persona7 = new Persona("Santiago Morales", "1128456123", "santiago.morales@email.com", 31);
Persona persona8 = new Persona("Camila Vargas", "1040123789", "camila.vargas@email.com", 27);
Persona persona9 = new Persona("Alejandro Castro", "1018987321", "alejandro.castro@email.com", 38);
Persona persona10 = new Persona("Mariana Ospina", "1039876543", "mariana.ospina@email.com", 20);


// bancos

   Banco Bancolombia = new Banco("Bancolombia", "Juan Carlos Mora");
    Banco nequi = new Banco("Nequi", "Andrés Vásquez");
  Banco davivienda = new Banco("Davivienda", "Javier Suárez Espinoza");
    Banco nu = new Banco("Nu Colombia", "Marcelo Morales");
    Banco bbva = new Banco("BBVA Colombia", "Mario Pardo Bayona");

    //cuentabancaria
    CuentaBancaria cuentaMarianaOspina = new CuentaBancaria("6471342516" , 100000 , "vagai123" , "ahorros" , persona10 , nequi );



    // informacion inicial mostrar



}
