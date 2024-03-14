import java.util.Scanner;

public class ListaExtra5_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float x1;
        float y1;
        float x2;
        float y2;

        float subX;
        float subY;

        float sumXY;

        double sqrtXY;
        
        System.out.println("Digite as coordenadas");

        x1 = in.nextFloat(); 
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        subX = x2-x1;
        subY = y2-y1;

        sumXY = subX*subX + subY*subY;

        sqrtXY = Math.sqrt(sumXY);  

        System.out.printf("Distância = %.2f", sqrtXY);

        in.close();

    }
}
