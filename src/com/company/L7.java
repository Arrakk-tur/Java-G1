package com.company;

public class L7 {
    public static void main(String[] args) {


        ShericalHorse sp = new ShericalHorse() {
        @Override
        void neigh() {
            System.out.println("ihohoho");
            }
        };
        sp.neigh();
        sp.gallop();

    SphericalHorseInVacuum sphiv = new SphericalHorseInVacuum();
        sphiv.neigh();
        sphiv.gallop();
        sphiv.walk(35);

    ShericalHorseOnSun shericalHorseOnSun = new ShericalHorseOnSun();

        shericalHorseOnSun.neigh();
    }
}
