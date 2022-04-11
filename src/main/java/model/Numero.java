package model;

public class Numero {

    public static double formulaSubtracao(double x, double y) {
        return (x - y);
    }

    public static double formulaAdicao(double x, double y) {
        return (x + y);
    }

    public static double formulaMultiplicacao(double x, double y) {
        return (x * y);
    }

    public static double formulaDivisao(double x, double y) {
        return (x / y);
    }

    //calcular o valor de X elevado a Y
    public static double calcXelevadoY(double x, double y) {
        return Math.pow(x, y);
    }

    public static double factorial(double x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;

    }

    public static boolean verificarSeNumeroEPrimo(int x) {
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                System.out.printf("O número %d é primo!", x);
                return false;
            }
        }
        System.out.printf("O número %d não é primo!", x);
        return true;
    }
}
