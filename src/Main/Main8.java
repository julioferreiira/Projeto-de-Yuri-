package Main;


import java.util.Scanner;

import static Automatos.AutomatoOito.reconhece;

public class Main8 {
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