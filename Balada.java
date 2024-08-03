import java.util.Scanner;

public class Balada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Você deseja entrar na balada? Responda 1 para sim ou 0 para não");
        int desejaEntrar = input.nextInt();

        if (desejaEntrar == 1) {
            
            System.out.println("Digite sua idade:");
            int idade = input.nextInt();

            if (idade >= 18) {
                System.out.println("Entrada permitida.");
            } else if (idade >= 16 && idade < 18) {
                
                System.out.println("Você está acompanhado de um responsável? Responda 1 para sim ou 0 para não");
                int acompanhado = input.nextInt();

                if (acompanhado == 1) {
                    System.out.println("Entrada permitida.");
                } else {
                    System.out.println("Entrada não permitida. Você precisa estar acompanhado de um responsável.");
                }
            } else {
                
                System.out.println("Entrada não permitida. Você deve ter pelo menos 16 anos.");
            }
        } else {
            System.out.println("Tenha uma boa noite!");
        }

    }
}
