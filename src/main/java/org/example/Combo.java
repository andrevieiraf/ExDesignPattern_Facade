package org.example;

public class Combo {

    private Burger burger;
    private Bebida bebida;
    private Sobremesa sobremesa;
    private String nomeCombo;


    public void CriarCombo(int tipo) {
        burger = new Burger();
        bebida = new Bebida();
        sobremesa = new Sobremesa();

        switch (tipo) {
            case 1:
                //outra forma seria com o construtor das classes com parametros  e passando o parametro na inicialização como abaixo
                //burger = new Burger("Frango", 20, 100);
                //optei por fazer com construtor sem parametro e passar o parametro pelo set
                nomeCombo = "Combo Master";
                burger.setGramas(100);
                burger.setDescricao("Frango");
                burger.setPreco(20);
                bebida = new Bebida();
                bebida.setMl(150);
                bebida.setDescricao("Fanta");
                bebida.setPreco(5);
                sobremesa = new Sobremesa();
                sobremesa.setTamanho("Pequena");
                sobremesa.setDescricao("Cookie");
                sobremesa.setPreco(5);
                break;
            case 2:
                nomeCombo = "Combo Super";
                burger.setGramas(150);
                burger.setDescricao("Carne");
                burger.setPreco(30);
                bebida.setMl(200);
                bebida.setDescricao("Coca");
                bebida.setPreco(7);
                sobremesa.setTamanho("Média");
                sobremesa.setDescricao("Brownie");
                sobremesa.setPreco(5);
        }
    }

    @Override
    public String toString() {
        return "Combo{" +
                "burger=" + burger +
                ", bebida=" + bebida +
                ", sobremesa=" + sobremesa +
                '}';
    }

    public void MostrarCombo(){
        System.out.println("Combo selecionado: " +nomeCombo+
                "\n Hambúrger: "+burger.getGramas() +" gramas, "+burger.getDescricao()+", R$ "+burger.getPreco()+
                "\n Bebida: "+bebida.getMl()+" Ml,"+bebida.getDescricao()+", R$ "+bebida.getPreco()+
                "\n Sobremesa: "+sobremesa.getDescricao()+", "+sobremesa.getTamanho()+ ", R$ "+sobremesa.getPreco());
    }
}
