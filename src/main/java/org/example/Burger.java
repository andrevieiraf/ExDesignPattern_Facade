package org.example;

public class Burger extends Produto{

    private int gramas;

    public Burger (String descricao, double preco, int gramas){
        this.getDescricao();
        this.getPreco();
        this.getGramas();
    }

    public int getGramas (){
        return gramas;
    }

    public void setGramas (int gramas){
        this.gramas = gramas;
    }
//    Burger burger = new Burger();
//    burger.setDescricao();
}
