package Automatos;

import java.util.Scanner;

public class AutomatoCinco {


    public static boolean reconhece(String w) {

        return w.equals("");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (é a string vazia).");
        } else {
            System.out.println("A string não é aceita (não é a string vazia).");
        }


        sc.close();
    }
}

