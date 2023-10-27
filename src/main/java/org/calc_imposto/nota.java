package org.calc_imposto;

public class nota {
    private double valor_nota;
    private double valor_produtos;
    private double valor_frete;
    private double valor_despesas_adicionais;

    private String porcento;

    private double porcentagem_imposto;

    public String getPorcento() {
        return porcento;
    }

    public void setPorcento(String porcento) {
        this.porcento = porcento;
    }
    public double getValor_nota() {
        return valor_nota;
    }

    public void setValor_nota(double valor_nota) {
        this.valor_nota = valor_nota;
    }

    public double getValor_produtos() {
        return valor_produtos;
    }

    public void setValor_produtos(double valor_produtos) {
        this.valor_produtos = valor_produtos;
    }

    public double getValor_frete() {
        return valor_frete;
    }

    public void setValor_frete(double valor_frete) {
        this.valor_frete = valor_frete;
    }

    public double getValor_despesas_adicionais() {
        return valor_despesas_adicionais;
    }

    public void setValor_despesas_adicionais(double valor_despesas_adicionais) {
        this.valor_despesas_adicionais = valor_despesas_adicionais;
    }

    public double getPorcentagem_imposto() {
        return porcentagem_imposto;
    }

    public void setPorcentagem_imposto(double porcentagemImposto) {
        this.porcentagem_imposto = porcentagem_imposto;
    }

    void calcula_frete(){
        if (valor_frete > 0) {
            valor_nota = valor_nota - valor_frete;
        }
    }

    void calcula_despesas(){
        if (valor_despesas_adicionais > 0) {
            valor_nota = valor_nota - valor_despesas_adicionais;
        }
    }

    void calcula_imposto(){
        porcentagem_imposto = valor_nota / valor_produtos;
        porcentagem_imposto = porcentagem_imposto - 1;
        porcentagem_imposto = porcentagem_imposto * 100;
    }

    @Override
    public String toString() {
        return String.format("A porcentagem de imposto da nota é de %.4f %s",getPorcentagem_imposto(),porcento);
    }
}
