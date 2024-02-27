import java.util.Scanner;

public class ListaDeExercicios1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numero; //inteiro

        System.out.println("digite o número: ");
        numero = in.nextInt(); //precisa de "Int" para que o programa entenda

        System.out.println(numero - 1);
    }
}
