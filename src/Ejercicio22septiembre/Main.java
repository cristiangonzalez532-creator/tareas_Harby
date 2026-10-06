package Ejercicio22septiembre;

public class Main {
    public static void main(String[] args){

        int[] numeros = {1, 5, 3, 5, 4, 16, 5, 8, 4};
        int numMasRepetido = 0, maxVeces = 0;

        for (int n : numeros) {
            int veces = 0;
            for (int x : numeros) {
                if (n == x) veces++;
            }
            if (veces > maxVeces) {
                maxVeces = veces;
                numMasRepetido = n;
            }
        }

        System.out.println("Output: " + numMasRepetido + "," + maxVeces);
    }

}
