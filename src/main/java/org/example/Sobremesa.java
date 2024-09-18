package org.example;

public class Sobremesa extends Produto{
    private String Tamanho;
    public Sobremesa(String descricao, double preco, String Tamanho){
        this.getDescricao();
        this.getPreco();
        this.getTamanho();
    }
    public String getTamanho (){
        return Tamanho;
    }

    public void setTamanho (String Tamanho){
        this.Tamanho = Tamanho;
    }
}


