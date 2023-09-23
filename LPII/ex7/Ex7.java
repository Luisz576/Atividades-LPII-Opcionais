package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        int op = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            if(op != -1){
                AreaCalculator areaCalculator;
                switch(op){
                    case 1:
                        areaCalculator = new AreaCalculator.Triangulo();
                        break;
                    case 2:
                        areaCalculator = new AreaCalculator.Circulo();
                        break;
                    case 3:
                        areaCalculator = new AreaCalculator.Trapezio();
                        break;
                    case 4:
                        areaCalculator = new AreaCalculator.Quadrado();
                        break;
                    case 5:
                        areaCalculator = new AreaCalculator.Retangulo();
                        break;
                    default:
                        continue;
                }
                areaCalculator.readValues(scanner);
                System.out.println("Resultado: " + areaCalculator.calculate());
            }
            printMenu();
            System.out.println("> ");
            op = scanner.nextInt();
        }while(op != 0);
        scanner.close();
    }

    public static void printMenu(){
        System.out.println("==== Area Calculator ====");
        System.out.println("1 - Triângulo Retângulo");
        System.out.println("2 - Circulo");
        System.out.println("3 - Trapézio");
        System.out.println("4 - Quadrado");
        System.out.println("5 - Retângulo");
        System.out.println("0 - Sair");
    }
}