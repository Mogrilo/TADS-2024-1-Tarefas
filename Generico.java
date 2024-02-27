import java.util.Scanner;

public class Generico {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String apelido;

        System.out.println("digite seu apelido: ");
        apelido = in.next();

        System.out.println(apelido);
    }
}
