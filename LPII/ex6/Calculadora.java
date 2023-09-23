package ex6;

import java.util.Scanner;

public class Calculadora{
    public double adicao(double a, double b){
        return a + b;
    }

    public double multiplicacao(double a, double b){
        return a * b;
    }

    public double divisao(double a, double b){
        return a / b;
    }
    
    public double subtracao(double a, double b){
        return a - b;
    }

    public static void main(String[] args){
        Calculadora cal = new Calculadora();
        int op = -1;
        Scanner scanner = new Scanner(System.in);
        do{
            if(op != -1){
                System.out.print("Informe a: ");
                double a = scanner.nextDouble();
                System.out.print("Informe b: ");
                double b = scanner.nextDouble();
                double res = -1;
                switch(op){
                    case 1:
                        res = cal.adicao(a, b);
                        break;
                    case 2:
                        res = cal.subtracao(a, b);
                        break;
                    case 3:
                        res = cal.multiplicacao(a, b);
                        break;
                    case 4:
                        res = cal.divisao(a, b);
                        break;
                }
                System.out.println("Resultado: " + res);
            }
            printMenu();
            System.out.println("> ");
            op = scanner.nextInt();
        }while(op != 0);
        scanner.close();
    }

    public static void printMenu(){
        System.out.println("==== CALCULADORA ====");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
    }
}