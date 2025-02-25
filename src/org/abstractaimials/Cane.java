package org.abstractaimials;

public class Cane extends AbstractAnimals{
    

    public Cane(String nome, int eta){
        super(nome, eta);
    };


    @Override
    public void verso(){
        System.out.println("Bau bau");
    }

    @Override
    public void mangia(){
        System.out.println("Mangia le ossa");
    }
}
