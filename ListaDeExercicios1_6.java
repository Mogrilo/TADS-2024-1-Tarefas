import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float score1;
        float score2;
        float media;

        System.out.println("Insira as duas notas: ");
        score1 = in.nextFloat(); 
        score2 = in.nextFloat(); 

        media = (score1+score2)/2;

        System.out.println(media);
        in.close();

    }
}
