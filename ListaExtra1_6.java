import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float comprimento;
        float largura;
        float perimetro;

        System.out.println("Digite o comprimento e a largura de um retângulo, ambos na mesma unidade:");

        comprimento = in.nextFloat(); 
        largura = in.nextFloat();

        perimetro = comprimento*2 + largura*2;

        System.out.println("O perímetro do retângulo é " + perimetro); 
  

        in.close();

    }
}
