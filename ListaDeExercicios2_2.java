import java.util.Scanner;

public class ExerciciosTADS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float base;
        float altura;
        float area;
        float perimetro;

        System.out.println("Diga a base e a altura, ambas com a mesma unidade:");

        base = in.nextFloat(); 
        altura = in.nextFloat(); 


        area = base*altura;
        perimetro = base*2 + altura*2;

        System.out.printf("O valor da área é %.2f e o seu perímetro é %.2f", area, perimetro); 

        in.close();

    }
}
