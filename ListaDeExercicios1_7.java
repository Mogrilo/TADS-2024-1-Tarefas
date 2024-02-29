import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float dist;
        float vm;

        System.out.println("Insira a distancia em KM e a velocidade média em KM/h, respectivamente: ");
        dist = in.nextFloat(); 
        vm = in.nextFloat(); 

        System.out.println(dist/vm); //tempo

        in.close();

    }
}
