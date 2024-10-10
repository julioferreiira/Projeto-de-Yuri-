package Main;

import java.util.Scanner;

import static Automatos.AutomatoNove.reconhece;

public class Main9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém um número par de '0's).");
        } else {
            System.out.println("A string não é aceita (não contém um número par de '0's).");
        }


        sc.close();
    }
}