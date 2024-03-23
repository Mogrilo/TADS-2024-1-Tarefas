import java.util.Scanner;

public class ListaExtra1_11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float real, dolar, cambio;

        System.out.println("Insira o valor em dólar e o câmbio atual");

        dolar = in.nextFloat();
        cambio = in.nextFloat();

        real = dolar * cambio;

        System.out.printf("O valor em real é %.4f", real);


    }

}
