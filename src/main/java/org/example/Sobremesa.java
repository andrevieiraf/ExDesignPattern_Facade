package org.example;

public class Sobremesa extends Produto{
    private String Tamanho;
//    public Sobremesa(String descricao, double preco, String Tamanho){
//        this.getDescricao();
//        this.getPreco();
//        this.getTamanho();
//    }

    public Sobremesa() {
    }

    public String getTamanho (){
        return Tamanho;
    }

    public void setTamanho (String Tamanho){
        this.Tamanho = Tamanho;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "descricao='" + descricao + '\'' +
                ", Tamanho='" + Tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }
}


