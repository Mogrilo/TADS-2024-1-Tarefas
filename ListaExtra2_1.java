import java.util.Scanner;

public class ListaExtra2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float num1;
        float num2;
        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;

        System.out.println("Digite dois numeros:");

        num1 = in.nextInt(); 
        num2 = in.nextFloat(); 

        soma = num1+num2;
        subtracao = num1-num2;
        divisao = num1/num2;
        multiplicacao = num1*num2;

        System.out.printf("soma: %.2f - subtracao: %.2f - divisao: %.2f - multiplicacao: %.2f", soma, subtracao, divisao, multiplicacao); 

        in.close();

    }
}
