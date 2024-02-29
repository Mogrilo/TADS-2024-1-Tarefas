import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int homens;
        int mulheres;
        int criancas;
        int carnes;

        System.out.println("Quantos homens, mulheres e crianças vão ir? ");
        homens = in.nextInt(); 
        mulheres = in.nextInt(); 
        criancas = in.nextInt(); 

        carnes = homens*400 + homens*80 + mulheres*320 + mulheres*64 + criancas*200 + criancas*20; 

        System.out.printf("A quantidade de carne que deve ser comprada é %dg", carnes); 

        in.close();

    }
}
