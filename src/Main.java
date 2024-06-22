//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

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
        System.out.println(suma);



    }
}