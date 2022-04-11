package model;

public class Calculadora {

//    private double x;
//    private double y;
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }

    // 1-Obter a soma de dois numeros
    public static double formulaSoma(double x, double y){
        return x + y;
    }

    // 2-Obter o produto de dois numeros
    public static double formulaProduto(double x, double y){
        return  x * y;
    }

    // 3-Obter a subtracção de dois números
    public static double formulaSubtracao(double x, double y){
        return x - y;
    }

    // 4-Obter o quociente de dois números
    public static double formulaQuociente(double x, double y) {
        return x / y;
    }

    // 8-Calcular o valor de x^y
    public static double calcXelevadoY(double x, double y){
        return Math.pow(x, y);
    }

    // 9-Factorial de um número
    public static double factorial(double x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        return fact;
    }


    //12 12-Converter um numero inteiro decimal para binário

    public static String decimalParaBinario(int x) {
        return Integer.toBinaryString(x);
    }




// primo para a frente
    /*public static boolean verificarSeNumeroEPrimo(int x) {
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                System.out.printf("O número %d é primo!", x);
                return false;
            }
        }
        System.out.printf("O número %d não é primo!", x);
        return true;
    }*/

    // 14 - Converter um número inteiro decimal para hexadecimal
    public static String converterHexadecimal(double x) {
        return Double.toHexString(x);
    }
}
