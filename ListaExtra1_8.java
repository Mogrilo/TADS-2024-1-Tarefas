import java.util.Scanner; 

public class ListaExtra1_8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float tempC;
        float tempF;

        System.out.println("Insira a temperatura");
        tempC = in.nextFloat();

        tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);

        in.close();


    }


}
