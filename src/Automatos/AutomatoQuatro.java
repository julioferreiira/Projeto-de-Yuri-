package Automatos;

import java.util.Scanner;

public class AutomatoQuatro {


    public static boolean reconhece(String w) {
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita.");
        } else {
            System.out.println("A string não é aceita (a linguagem é vazia).");
        }


        sc.close();
    }
}
