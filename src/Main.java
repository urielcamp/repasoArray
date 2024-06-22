import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        int [] numeros = new int [5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 2;
        numeros[4] = 1;

        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        //System.out.println(suma);

        //Ejercicio 2

        String [] cadenas = {"Hola", "Mundo", "Java", "Programacion"};

        for (int i = 0; i < cadenas.length; i++){
            //System.out.println("La cadena: " + cadenas[i] + " tiene una longitud de: " + cadenas[i].length());
        }

        //Ejercicio 3

        int [] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < enteros.length; i++){
            if (enteros[i] % 2 == 0){
                System.out.println(enteros[i]);
            }
        }





    }
}