package org.abstractaimials;

public class Aquila extends AbstractAnimals implements IVolanti {

    
    public Aquila(String nome, int eta){
        super(nome, eta);
    }


    @Override
    public void verso(){
        System.out.println("Verso del aquila");
    }


    @Override
    public void mangia(){
        System.out.println("Piccoli mammiferi");
    }

    @Override
    public void vola(){
        System.out.println("Vola");
    }
}
