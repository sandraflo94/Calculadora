package controller;

import model.Calculadora;

public class Controller {

        public double getFormulaSubtracao(double x, double y){
            return Calculadora.formulaSubtracao(x, y);
        }

        public double getFormulaSoma(double x,double y){
            return  Calculadora.formulaSoma(x,y);
        }


        public double getFormulaProduto(double x,double y){
            return Calculadora.formulaProduto(x,y);

        }

    public double getFormulaQuociente( double x, double y){
        return Calculadora.formulaQuociente (x,y);

    }

//        public void mostrarResultado(double x,double y){
//            Calculadora.mostrarResultado(x,y);
//        }
    public String converterBinarioDecimal(int x){return Calculadora.decimalParaBinario(x);}

        /*public  boolean getVerificarNumeroPrimo(double x){
            Calculadora.verificarSeNumeroEPrimo((int) x);
            return true;
        }*/

        public double getCalculoFatorial(double x) {
            return  Calculadora.factorial(x);
        }


         public double getCalculoXelevadoY(double x, double y){
        return Calculadora.calcXelevadoY(x,y);
         }

         public boolean getVerificarSomaCubos(double x) {
            Calculadora.verificarSomaCubos((int) x);
             return true;
         }


         public String converterHexadecimal(double x) {
        return Calculadora.converterHexadecimal(x);
      }

}
