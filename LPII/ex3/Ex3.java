package ex3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        DecimalFormat fmt = new DecimalFormat("0.00"); 
        
        System.out.println(id + " " + fmt.format(horas*valorHora));
        
        scanner.close();
    }
}