package model;

public class Numero {

    int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double formulaSubtracao(Numero outroNumero){
        return this.numero - outroNumero;
    }

    public double formulaQuociente(Numero outroNumero){
        return  this.numero / outroNumero;
    }

    //calcular o valor de X elevado a Y
    public double calcXelevadoY(double x, double y){
        return Math.pow(x,y);
    }
}
