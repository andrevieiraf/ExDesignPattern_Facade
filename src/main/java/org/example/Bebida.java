package org.example;

public class Bebida extends Produto{
    private int Ml;
//    public Bebida(String descricao, double preco, int Ml){
//        this.getDescricao();
//        this.getPreco();
//        this.getMl();
//    }

    public Bebida() {
    }

    public int getMl (){
        return Ml;
    }

    public void setMl (int Ml){
        this.Ml = Ml;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "Ml=" + Ml +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
