package com.company;

import java.io.IOException;

public class L5 {

    public static void main(String[] args) throws IOException {
//        String[] stringArray = new String[10];
//        stringArray[0] = "smth";
//        System.out.println(stringArray[1]);
//        int [][] twoDMass = new int[10][6];
//        // Двумерный массив.
//        twoDMass[4][1] = 4;
//        System.out.println(twoDMass[4][1]);

        // ЦИКЛЫ
        int count = 0;
//        while (count <= 55)
//        {
//            System.out.println(count);
//            count++;
//        }
////        System.out.println("count = " + count);

        // Цикл While --------


//        while (count <= 101)
//        {
//            System.out.println(count);
//            count++;
//        }
////        System.out.println("count = " + count);

        // Цикл DO --------
//        do {
//            count++;
//        } while (count < 0);
//        System.out.println("count = " + count);

        // Цикл FOR --------

//        for (int i=0 /*counter*/; i<10 /*statment*/; i++ /*law*/){
//            System.out.println("Hello " + i);
//        }
//        int[] intMass = new int[10];
//        for (int i = 0; i < 10; i++){
//            intMass[i] =(int) (1 + Math.random()*20);//Main.reader();
//        }
//        for (int i = 0; i < intMass.length; i++){
//            System.out.println("Element number : " + i + " > " + intMass[i]);
//        }
        String[] intMass = new String[5];
        for (int i = 0; i < 5; i++){
            intMass[i] =/*(int) (1 + Math.random()*20);*/Main.reader();
        }
        for (int i = 0; i < intMass.length; i++){
            System.out.println("Element number : " + i + " > " + intMass[i]);
            if (intMass[i].equals("Sasha")) {
                System.out.println("Hello Sasha!");
            }
        }

    }
}
