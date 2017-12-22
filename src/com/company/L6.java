package com.company;

import java.io.IOException;

public class L6 {
    public static void main(String[] args) throws IOException {
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++){
            cats[i] = new Cat(Main.reader());

        }
    }
}