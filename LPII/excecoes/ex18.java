import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador: ");
            float n = scanner.nextFloat();
            System.out.print("Digite o denominador: ");
            float d = scanner.nextFloat();
            if (d == 0f) {
                throw new ArithmeticException("Divisão por zero");
            }
            float r = n / d;
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}