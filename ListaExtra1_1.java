import java.util.Scanner;

public class ListaExtra1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float numFloat;
        float floatPraInt;
        float numInt;
        float intPraFloat;

        System.out.println("Digite um numero inteiro e um float:");

        numInt = in.nextInt(); 
        numFloat = in.nextFloat(); 

        floatPraInt = (int)numFloat;
        intPraFloat = (float)numInt;

        System.out.printf("Int: %.2f - Float: %.2f", floatPraInt, intPraFloat); 

        in.close();

    }
}
