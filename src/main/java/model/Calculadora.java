package model;

public class Calculadora {

    private Double temp;

    public Calculadora(Double temp) {
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

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
    public static double formulaQuociente(double x, double y){
        return  x / y;
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
    //11-Verificar se um dado numero é a soma dos cubos(^3) do digitos que o compôem
    public static boolean verificarSomaCubos( int x){

            int sum = 0;
            for (int i=0; i<=x; i++)
                sum += x*x*x;
        return sum == x;
    }



    //12 12-Converter um numero inteiro decimal para binário

    public static String decimalParaBinario(int x) {
        return Integer.toBinaryString(x);
    }




    // 10-primo para a frente
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
    // 13 - Converter número binário para decimal
    public static int binaryToDecimal(int n) {
        int num = n;
        int dec_value = 0;

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    // 14 - Converter um número inteiro decimal para hexadecimal
    public static String converterHexadecimal(double x) {
        return Double.toHexString(x);
    }

    //5-Memorizar o resultado de uma operação
    public void resultadoMemorizar(double x){
        setTemp(x);
    }

    //6-Apagar o resultado de uma operação
    public void resultadoApagar(){
        this.temp=null;
    }


}
