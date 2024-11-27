package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10, 9:
                conceito = "A";
                break;
            case 8, 7:
                conceito = "B";
                break;
            case 6, 5:
                conceito = "C";
                break;
            case 4, 3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "E";
                break;
            default:
                conceito = "Não Encontrado";
        }

        // Imprima o resultado (adicione esta linha para ver o conceito)
        System.out.println("Conceito: " + conceito);
    }
}