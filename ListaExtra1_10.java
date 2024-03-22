import java.util.Scanner;

public class ListaExtra1_10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float velKM, velMS;
        
        System.out.println("Insira a velocidade em KM/h");

        velKM = in.nextFloat();

        velMS = velKM/3.6f;

        System.out.printf("A velocidade em m/s é %.4f", velMS);

    }

}
