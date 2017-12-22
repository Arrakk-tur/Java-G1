package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
//        System.out.print("Hello world");
//        System.out.println("Hello world");
//
//        System.out.println();
//
//        int someInt = 3;
//        long someLong = 999999999999L;
//        float someFloat = 32.0f;
//        double someDouble = 32.1545454;
//        char someChare = 'g';
//        String someStr = "dksfgj ;dslgfkj ds;lgkj sd;lgfkja;ergj dsflgk;l";
//        byte someByte = 127;
//        boolean someBoolean = true;
//        short someShort = 32258;
//        System.out.println(someInt + someDouble);
//        System.out.println(someInt - someDouble);
//        System.out.println(someInt * someDouble);
//        System.out.println(someInt / someDouble);
//        System.out.println(someInt * someChare);
//        System.out.println(someInt * someChare);
//        String mama = "mama";
//        String myla = "myla";
//        String result = mama + "" + myla;
//        System.out.println(result);
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        System.out.println("Введите имя");
//        String name = bufferedReader.readLine(); //читаем строку с клавы
//        System.out.println(name);
//        System.out.println("Введите возраст");
//        String sAge = bufferedReader.readLine(); //читаем строку с клавы
//        System.out.println(sAge);
//        int nAge = Integer.parseInt(sAge); // преобразовываем строку в число
//        System.out.println(name + " " + nAge);

//        int d = 4;
//        int f = 56;
//
//        int a = sum(d, f);
//        System.out.println(a);
//        System.out.println("End");


        // УРОК № 3

//        int consoleValue = reader();
//        System.out.println("Переменная 1: " + consoleValue);
//
//        int consoleValue2 = reader();
//        System.out.println("Переменная 2: " + consoleValue2);
//
//        int sumValue = sum(consoleValue, consoleValue2);
//        System.out.println("Сумма: " + sumValue);
//
//        int minusValue = minus(consoleValue, consoleValue2);
//        System.out.println("Разница: " + minusValue);
//
//        int multValue = mult(consoleValue, consoleValue2);
//        System.out.println("Умножение: " + multValue);
//
//        int divedValue = dived(consoleValue, consoleValue2);
//        System.out.println("Деление: " + divedValue);
        // УРОК № 4
//    long longVar = 999999999999999999L;
//    int intVar = (int) longVar;
//        System.out.println("intVar" + intVar);

//        System.out.println("Enter your value.");
//        int a= reader();
//        int b = reader();
//        int c = reader();
//        int d = reader();
//
//        if (a == b && c==d) {
//            System.out.println(true);
//        }
//        else {
//            System.out.println(false);
//        }
//    }

//    public static int minus(int value1, int value2) { // УРОК № 3
//        int c = value1 - value2;
//        return c;
//
//    }
//
//    public static int sum(int value1, int value2) {   // УРОК № 3
//        int c = value1 + value2;
//        return c;
//    }
//
//    public static int mult(int value1, int value2) {  // УРОК № 3
//        int c = value1 * value2;
//        return c;
//    }
//
//    public static int dived(int value1, int value2) {  // УРОК № 3
//        int c = value1 / value2;
//        return c;
//    }

//        Cat catVasya = new Cat(3, 5, 56, new int[5]);
//
//        System.out.println("Vasya " + catVasya.a);
//        System.out.println("Vasya " + catVasya.b);
//
//        Cat catPetya = new Cat(56, 99, 4412);
//
//        System.out.println("Petya " + catPetya.a);
//        System.out.println("Petya " + catPetya.b);
//
//        catPetya.getA();
//        catPetya.setA(35);

        // УРОК № 7

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

        ShericalHorseOnSun shericalHorseOnSun = new ShericalHorseOnSun();

        shericalHorseOnSun.neigh();
    }
        public static String reader () throws IOException {  // УРОК № 3
            System.out.println("Enter your value.");
            BufferedReader bufferedReader = new
                    BufferedReader(new InputStreamReader(System.in));

//        String s = bufferedReader.readLine();
//        int x = Integer.parseInt(s); // преобразовываем строку в число

            return bufferedReader.readLine();
        }


}
