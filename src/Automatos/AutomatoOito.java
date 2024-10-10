package Automatos;

import java.util.Scanner;

public class AutomatoOito {


    public static boolean reconhece(String w) {
        int contadorDe1s = 0;


        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '1') {
                contadorDe1s++;
            }
        }

        return contadorDe1s % 2 != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (termina com um número ímpar de '1's).");
        } else {
            System.out.println("A string não é aceita (não termina com um número ímpar de '1's).");
        }


        sc.close();
    }
}

