import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float metros;
        float centimetros;

        System.out.println("Diga o tamanho em metros:");

        metros = in.nextFloat(); 

        centimetros = metros*100;

        System.out.printf("O valor inserido foi %.2f Metros e o seu respectivo valor em centímetros é %.2f",metros, centimetros); 

        in.close();

    }
}
