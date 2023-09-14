package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.id = scanner.nextInt();
        funcionario.horas = scanner.nextInt();
        funcionario.valorHora = scanner.nextInt();

        System.out.println(funcionario.id + " " + funcionario.getSalario());

        scanner.close();
    }
}
