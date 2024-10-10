package Automatos;

import java.util.Scanner;

public class AutomatoSete{


    public static boolean reconhece(String w) {

        if (w.length() == 0) {
            return false;
        }

        return w.charAt(0) == w.charAt(w.length() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (começa e termina com o mesmo símbolo).");
        } else {
            System.out.println("A string não é aceita (não começa e termina com o mesmo símbolo).");
        }


        sc.close();
    }
}

