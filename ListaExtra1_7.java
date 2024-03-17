import java.util.Scanner;

public class ListaExtra1_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float num1;
        float num2;
        boolean comparacaoMaiorMenor;
        boolean comparacaoIgual;

        System.out.println("Digite dois números");

        num1 = in.nextFloat(); 
        num2 = in.nextFloat();

        comparacaoMaiorMenor = num1>num2;
        comparacaoIgual = num1 == num2;

        if(comparacaoMaiorMenor){
            System.out.print("O primeiro número é maior");
        }
        else if(comparacaoIgual){
            System.out.print("Os números são iguais");
        }
        else if(!comparacaoMaiorMenor){
            System.out.println("O primeiro número é menor");
        }

        in.close();

    }
}
