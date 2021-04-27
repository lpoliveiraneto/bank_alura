package br.com.bytebank.banco.modelo;

public class GuardadoDeReferencias {
    private Object[] referencias;
    private int posicaoLivre;
    private int quantidadeDeElementos;

    public GuardadoDeReferencias(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
        this.quantidadeDeElementos = 0;
    }

    public void adiciona(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public void setQuantidadeDeElementos(int quantidadeDeElementos) {
        this.quantidadeDeElementos = quantidadeDeElementos;
    }

    public Object getReferencia(int i) {
        return this.referencias[i];
    }
}
