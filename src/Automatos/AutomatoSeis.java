package Automatos;

import java.util.Scanner;

public class AutomatoSeis {


    public static boolean reconhece(String w) {
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (todas as strings são aceitas).");
        } else {
            System.out.println("A string não é aceita.");
        }


        sc.close();
    }
}
