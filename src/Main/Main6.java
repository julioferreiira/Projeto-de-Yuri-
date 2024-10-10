package Main;


import java.util.Scanner;

import static Automatos.AutomatoSeis.reconhece;

public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém '010' como subcadeia).");
        } else {
            System.out.println("A string não é aceita (não contém '010' como subcadeia).");
        }


        sc.close();
    }
}