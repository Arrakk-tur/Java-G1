package com.company;

public class SphericalHorseInVacuum extends ShericalHorse implements Walk{

    @Override
    void neigh() {
        System.out.println("Sphiv is naighting...");
    }

    @Override
    void gallop() {
        System.out.println("Bla-bla-bla!");
    }

    @Override
    public void walk(int a) {
        System.out.println("Meters: " + a);
    }

    @Override
    public void walk(int a, int b) {
        System.out.println("Meters: " + a);
        System.out.println("Km: " + b);


    }
}
