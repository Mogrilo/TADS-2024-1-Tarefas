mport java.util.Scanner;

public class ListaDeExercicios1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float numero;

        System.out.print("digite o número: ");
        numero = in.nextFloat(); //precisa de "Float" para que o programa entenda

        System.out.println(numero*1.2 );
        System.out.println(numero*0.8);
        System.out.println(numero*0.2);

    }
}
