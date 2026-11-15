public class Main {
    public static void main(String[] args) {
        int resultadoSuma = Calculadora.sumar(5, 3);
        System.out.println("Suma total: " + resultadoSuma);
        boolean esPar = Calculadora.esPar(4);
        System.out.println("¿El número 4 es par?: " + esPar);
    }
}