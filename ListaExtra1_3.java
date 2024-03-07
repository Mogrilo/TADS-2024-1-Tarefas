import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nome1;
        String nome2;
        String concatenacao;

        System.out.println("Digite dois nomes:");

        nome1 = in.nextLine(); 
        nome2 = in.nextLine(); 

        concatenacao = nome1+nome2;

        System.out.print(concatenacao); 

        in.close();

    }
}
