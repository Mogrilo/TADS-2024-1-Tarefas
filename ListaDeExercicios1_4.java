import java.util.Scanner;

public class ListaDeExercicios1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float base;
        float altura;
        float area;

        System.out.println("digite a base e altura do triângulo: ");
        base =   in.nextFloat(); //precisa de "Float" para que o programa entenda
        altura = in.nextFloat();

        area = (base*altura)/2;

        System.out.println(area);

    }
}
