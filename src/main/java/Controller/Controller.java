package Controller;

import model.Numero;

public class Controller {

    public double getFormulaSubtracao(double x, double y){
        return Numero.formulaSubtracao(x, y);
    }

    public double getFormulaSoma(){
        return  Numero.formulaSoma();
    }

    public double getFormulaQuociente( double x, double y){
        return Numero.formulaQuociente (x,y);

    }

    public double getFormulaProduto(){
        return Numero.formulaProduto();

    }

    public void mostrarResultado(){
        Numero.mostrarResultado();
    }

    public  boolean getVerificarNumeroPrimo(){
        Numero.verifarNumeroPrimo();
        return true;
    }

    public double getCalculoFatorial() {
        return  Numero.calcularFatorial();;
    }


    public double getCalculoXelevadoY(){
        return Numero.calcXelevadoY();
    }


}
