package Automatos;

import java.util.Scanner;

public class AutomatoTres{

    public static boolean reconhece(String w) {

        if (w.length() > 0 && w.charAt(0) == '0') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (começa com '0').");
        } else {
            System.out.println("A string não é aceita (não começa com '0').");
        }


        sc.close();
    }
}

