package Main;

import java.util.Scanner;
import static Automatos.AutomatoCinco.reconhece;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a string para verificar:");
        String entrada = sc.nextLine();


        if (reconhece(entrada)) {
            System.out.println("A string é aceita (contém mais '0's do que '1's).");
        } else {
            System.out.println("A string não é aceita (não contém mais '0's do que '1's).");
        }


        sc.close();
    }
}