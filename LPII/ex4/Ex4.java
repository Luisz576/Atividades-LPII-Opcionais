package ex4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static final int SIZE = 2;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int ids[] = new int[SIZE];
        int horas[] = new int[SIZE];
        double valoresHora[] = new double[SIZE];

        for(int i = 0; i < SIZE; i++){
            ids[i] = scanner.nextInt();
            horas[i] = scanner.nextInt();
            valoresHora[i] = scanner.nextDouble();
        }

        DecimalFormat fmt = new DecimalFormat("0.00");
        
        for(int i = 0; i < SIZE; i++){
            System.out.println(ids[i] + " " + fmt.format(horas[i]*valoresHora[i]));
        }
        
        scanner.close();
    }
}