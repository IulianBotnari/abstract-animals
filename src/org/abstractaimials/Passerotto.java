package org.abstractaimials;

public class Passerotto extends AbstractAnimals implements IVolanti {


    public Passerotto(String nome, int eta){
        super(nome, eta);
    }


    @Override
    public void verso(){
        System.out.println("pio pio");
    }


    @Override
    public void mangia(){
        System.out.println("Mangia insetti");
    }

    @Override
    public void vola(){
        System.out.println("Vola");
    }
    
}
