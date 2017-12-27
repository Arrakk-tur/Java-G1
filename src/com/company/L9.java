package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L9 {
    public static void main(String[] args) {
        try {
            System.out.println(reader());
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public static int reader () throws IOException {
        System.out.println("Enter your value.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s= null;
        int value = 0;
//        try {
            s = reader.readLine();
            value = Integer.parseInt(s);

//            throw new IOException();
//        }
//        catch (NumberFormatException e) {
//            System.out.println("End prog");
//        }
//        catch (IOException e) {
//            System.out.println("IOException");
//        }
//        finally {
//            System.out.println("Finally");
//            System.exit(0);
//        }
        return value;
        }
}