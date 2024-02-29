import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float total;

        float validos;
        float validosPercent;

        float branco;
        float brancoPercent;

        float nulos;
        float nulosPercent;


        System.out.println("Entrada de votos - total, validos, brancos e nulos, respectivamente");
        total = in.nextFloat(); 
        validos = in.nextFloat(); 
        branco = in.nextFloat(); 
        nulos = in.nextFloat(); 

        validosPercent = 100*validos/total;
        brancoPercent = 100*branco/total;
        nulosPercent = 100*nulos/total;


        System.out.printf("Votos válidos(precentual): %.2f", validosPercent); 
        System.out.printf("\nVotos em branco(percentual): %.2f", brancoPercent);
        System.out.printf("\nVotos nulos(percentual): %.2f", nulosPercentPercent);

        in.close();

    }
}
