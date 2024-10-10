package Automatos;

import java.util.Scanner;

public class AutomatoNove{


    public static boolean reconhece(String w) {
        int contadorDe0s = 0;
        int contadorDe1s = 0;


        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '0') {
                contadorDe0s++;
            } else if (w.charAt(i) == '1') {
                contadorDe1s++;
            }
        }


        return contadorDe0s > contadorDe1s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém mais '0's do que '1's).");
        } else {
            System.out.println("A string não é aceita (não contém mais '0's do que '1's).");
        }


        sc.close();
    }
}
