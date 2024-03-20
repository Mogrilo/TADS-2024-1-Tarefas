import java.util.Scanner;

public class ListaExtra1_9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float num1, num2, num3, media;

        System.out.println("insira 3 números");

        num1 = in.nextFloat(); 
        num2 = in.nextFloat(); 
        num3 = in.nextFloat(); 

        media = (num1+num2+num3)/3;

        System.out.println(media);



    }

}
