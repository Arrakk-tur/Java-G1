package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L9_2 {
    public static void main(String[] args) {
        System.out.println("Enter your value.");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            bufferedReader.readLine();
            throw produceExeption();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static IOException produceExeption(){
        return new IOException();
    }
}
