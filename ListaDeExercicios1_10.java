import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorIngresso;
        int socios;
        int naoPagantes;
        int naoSocios;

        int publicoTotal;
        float rendaTotal;
        float rendaPerdida;

        System.out.println("Digite o valor do ingresso, quantos sócios, não sócios e crianças foram ao jogo!");

        valorIngresso = in.nextFloat(); 
        socios = in.nextInt(); 
        naoSocios = in.nextInt(); 
        naoPagantes = in.nextInt(); 

        publicoTotal = socios+naoSocios+naoPagantes;
        rendaTotal = (naoSocios*valorIngresso) + (socios*valorIngresso*0.7f) + (naoPagantes*0);
        rendaPerdida = socios*valorIngresso*0.3f + naoPagantes*valorIngresso;

        System.out.printf("o total de pessoas que foram foi %d, o valor arrecadado foi %.2f e o valor perdido foi %.2f", publicoTotal, rendaTotal, rendaPerdida); 

        in.close();

    }
}
