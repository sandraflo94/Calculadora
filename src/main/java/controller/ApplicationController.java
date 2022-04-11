package controller;

import model.Numero;

public class ApplicationController {
    public double formulaSubtracao(double x, double y) {
        return Numero.formulaSubtracao(x, y);
    }

    public double formulaAdicao(double x, double y) {
        return Numero.formulaAdicao(x, y);
    }

    public double formulaMultiplicacao(double x, double y) {
        return Numero.formulaMultiplicacao(x, y);
    }

    public double formulaDivisao(double x, double y) {
        return Numero.formulaDivisao(x, y);
    }

    //calcular o valor de X elevado a Y
    public double calcXelevadoY(double x, double y) {
        return Numero.calcXelevadoY(x, y);
    }

    public double factorial(double x) {
        return Numero.factorial(x);
    }
    public boolean verificarSeNumeroEPrimo (int x){
        return Numero.verificarSeNumeroEPrimo(x);
    }
}
