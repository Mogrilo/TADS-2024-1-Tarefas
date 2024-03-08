import java.util.Scanner;

public class ListaExtra1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        char character;
        int asciiValue;
        String characterUpperCase;
        String characterLowerCase;

        System.out.println("Digite um único caractere:");

        character = in.next().charAt(0); 
        asciiValue = character; 
        characterUpperCase = Character.toString(character).toUpperCase();
        characterLowerCase = Character.toString(character).toLowerCase();


        if(asciiValue > 96){
            System.out.println(character); 
            System.out.println(asciiValue); 
            System.out.println(characterUpperCase); 
            }

        else if(asciiValue < 97){
            System.out.println(character); 
            System.out.println(asciiValue); 
            System.out.println(characterLowerCase); 

        }

        in.close();

    }
}
