package Main;


import java.util.Scanner;

import static Automatos.AutomatoDois.reconhece;

public class Main2 {
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