package org.example;

public class Burger extends Produto{

    private int gramas;

//    exemplo do construtor com parametros
//    public Burger (String descricao, double preco, int gramas){
//        this.descricao = descricao;
//        this.preco = preco;
//        this.gramas = gramas;
//    }

    //construtor utilizado
    public Burger() {
    }

    public int getGramas (){
        return gramas;
    }

    public void setGramas (int gramas){
        this.gramas = gramas;
    }


    @Override
    public String toString() {
        return "Burger{" +
                "gramas=" + gramas +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}


