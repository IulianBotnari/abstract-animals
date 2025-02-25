package org.abstractaimials;

public abstract class AbstractAnimals {
    protected String nome;
    protected int eta;

    public AbstractAnimals(String nome, int eta){
        this.nome = nome;
        this.eta = eta;

    }


    public void dormi(){
        System.out.println("zzzz");
    }

    public abstract void verso();
    
    public abstract void mangia();
}
