package org.abstractaimials;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Cane esempioDiCane = new Cane("Pippo", 5);
        Delfino esempioDiDelfino = new Delfino("Gigi", 6);

        esempioDiCane.verso();
        esempioDiDelfino.verso();
    }
}
