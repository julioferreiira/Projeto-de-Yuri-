package Main;

import java.util.Scanner;

import static Automatos.AutomatoTres.reconhece;

public class Main3 {
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