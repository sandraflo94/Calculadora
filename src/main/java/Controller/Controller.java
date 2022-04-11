package Controller;

import model.Calculadora;

public class Controller {

        public double getFormulaSubtracao(double x, double y){
            return Calculadora.formulaSubtracao(x, y);
        }

        public double getFormulaSoma(double x,double y){
            return  Calculadora.formulaSoma(x,y);
        }

        public double getFormulaQuociente( double x, double y){
            return Calculadora.formulaQuociente (x,y);

        }

        public double getFormulaProduto(double x,double y){
            return Calculadora.formulaProduto(x,y);

        }

        /*public void mostrarResultado(){
            Calculadora.mostrarResultado();
        }*/

        /*public  boolean getVerificarNumeroPrimo(){
            Calculadora.verifarNumeroPrimo();
            return true;
        }*/

        public double getCalculoFatorial(double x) {
            return  Calculadora.factorial(x);
        }


       // public double getCalculoXelevadoY(){
//            return Numero.calcXelevadoY();
//        }

}
