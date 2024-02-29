import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float temperaturaC;
        float temperaturaF;

        System.out.println("digite a temperatura em graus Celsius: ");
        temperaturaC = in.nextFloat(); 
        temperaturaF = (9*temperaturaC/5 + 32); 

        System.out.println(temperaturaF);
        in.close();

    }
}
