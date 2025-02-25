package org.abstractaimials;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cane esempioDiCane = new Cane("Pippo", 5);
        Delfino esempioDiDelfino = new Delfino("Gigi", 6);
        Passerotto esempioDiPasserotto = new Passerotto("Merlino", 2);
        Aquila esempiodiAquila = new Aquila("Occhio di falco", 3);

        // esempioDiCane.verso();
        // esempioDiDelfino.verso();
        // esempioDiDelfino.nuota();


        faiNuotare(esempioDiDelfino); 

        faiVolare(esempioDiPasserotto);
        faiVolare(esempiodiAquila);     

        

    }    

    public static void faiVolare(IVolanti animaleVolante) {
        animaleVolante.vola();
    }

    
    public static void faiNuotare(INuotanti animaleNuotante) {
        animaleNuotante.nuota();
    }
    



}
