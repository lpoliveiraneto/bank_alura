package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;
    private int quantidadeDeElementos;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
        this.quantidadeDeElementos = 0;
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public void setQuantidadeDeElementos(int quantidadeDeElementos) {
        this.quantidadeDeElementos = quantidadeDeElementos;
    }

    public Conta getReferencia(int i) {
         return this.referencias[i];
    }
}
