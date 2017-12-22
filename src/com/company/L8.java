package com.company;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.SimpleTimeZone;

public class L8 {
    public static void main(String[] args) {
        Date currentDate = new Date();

//        // Работа со списком
//
//        ArrayList <String> arrayList = new ArrayList<>();
//        for (int i = 0; i < 5; i++){
//            arrayList.add("String " + i);
//        }
//        // adds new value at the last position
//        arrayList.add("New value");
//        // adds element at second index
//        arrayList.add(2, "New tree");
//        // delete first element
//        arrayList.remove(0);
//        // etc
//        arrayList.set(1, "New string first index");
//
//
//        for (int i = 0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }

//            // Работа со Словарем
//
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", new Integer(1));
        hashMap.put("2", new Integer(2));
        hashMap.put("3", new Integer(3));
        hashMap.put("4", new Integer(4));
        hashMap.put("5", new Integer(5));
        hashMap.put("6", new Integer(6));
        hashMap.put("7", new Integer(657));
//
//        for (int i = 0; i <= hashMap.size(); i++){
//            System.out.println(hashMap.get(String.valueOf(i)));
//        }
//
//        System.out.println("Empty? " + hashMap.isEmpty());

//        // Date
////        Date currentDate = new Date();
//        System.out.println(currentDate);
//        System.out.println(currentDate.getTime());
//
//        SimpleDateFormat sqp= new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sqp.format(currentDate));

        // Цикл Foreach

        for (HashMap.Entry<String, Integer> hm : hashMap.entrySet()){
            System.out.println("---------");
            System.out.println(hm.getKey());
            System.out.println(hm.getValue());
        }

    }
}
