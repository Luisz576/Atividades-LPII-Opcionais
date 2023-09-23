package ex7;

import java.util.Scanner;

public abstract class AreaCalculator {
    public abstract void readValues(Scanner scanner);
    public abstract double calculate();

    public static class Circulo extends AreaCalculator{
        double r;
        @Override
        public void readValues(Scanner scanner) {
            r = scanner.nextInt();
        }

        @Override
        public double calculate() {
            return r * r * Math.PI;
        }
    }

    public static class Trapezio extends AreaCalculator{
        double a, b, c;
        @Override
        public void readValues(Scanner scanner) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }

        @Override
        public double calculate() {
            return (a + b) * c / 2;
        }
    }

    public static class Quadrado extends AreaCalculator{
        double b;
        @Override
        public void readValues(Scanner scanner) {
            b = scanner.nextInt();
        }

        @Override
        public double calculate() {
            return b * b;
        }
    }

    public static class Retangulo extends AreaCalculator{
        double a, b;
        @Override
        public void readValues(Scanner scanner) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        @Override
        public double calculate() {
            return a * b;
        }
    }

    public static class Triangulo extends AreaCalculator{
        double a, b;
        @Override
        public void readValues(Scanner scanner) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        @Override
        public double calculate() {
            return a * b / 2;
        }
    }
}
