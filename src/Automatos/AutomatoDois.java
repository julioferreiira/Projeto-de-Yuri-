package Automatos;

import java.util.Scanner;

public class AutomatoDois {

    public static boolean reconhece(String w) {

        for (int i = 0; i < w.length() - 1; i++) {

            if (w.charAt(i) == '0' && w.charAt(i + 1) == '0') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém pelo menos um par de '00').");
        } else {
            System.out.println("A string não é aceita (não contém um par de '00').");
        }


        sc.close();
    }
}

