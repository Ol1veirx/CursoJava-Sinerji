package calculo;

import interno.OperacoesAritmeticas;

public class Calculadora {
    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        return opAritmeticas.soma(nums);
    }
}
