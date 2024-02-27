import java.util.Scanner;

public class ListaDeExercicios1_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float numero;

        System.out.print("digite o número: ");
        numero = in.nextFloat(); //precisa de "Float" para que o programa entenda

        float numExp = numero*numero;

        System.out.println(numExp);

    }
}
