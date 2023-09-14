package ex2;

import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.triangulo(a, c));
        System.out.println(areaCalculator.circulo(c));
        System.out.println(areaCalculator.trapezio(a, b, c));
        System.out.println(areaCalculator.quadrado(a));
        System.out.println(areaCalculator.retangulo(a, b));

        scanner.close();
    }
}