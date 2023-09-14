package ex2;

public class AreaCalculator {
    public double triangulo(int a, int c){
        return (a*c) / 2f;
    }
    public double circulo(int c){
        return c*c * Math.PI;
    }
    public double trapezio(int a, int b, int c){
        return ((a + b) * c) / 2f;
    }
    public double quadrado(int a){
        return a*a;
    }
    public double retangulo(int a, int b){
        return a*b;
    }
}
