public class CalculadoraBasica {

    public static void main(String[] args) {

        double num1 = 40;
        double num2 = 15;

        System.out.println("=== CALCULADORA BÁSICA ===");

        // Suma
        System.out.println("Suma: " + (num1 + num2));

        // Resta
        System.out.println("Resta: " + (num1 - num2));

        // Multiplicación
        System.out.println("Multiplicación: " + (num1 * num2));

        // División
        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }
}
