package org.abstractaimials;

public class Delfino extends AbstractAnimals implements INuotanti{

    public Delfino(String name, int eta){
        super(name, eta);
    }

    @Override
    public void verso(){
        System.out.println("Verso del delfino");
    }

    @Override
    public void mangia(){
        System.out.println("Mangia pesci");
    }

    @Override
    public void nuota(){
        System.out.println("Nuota");
    }
    
}
