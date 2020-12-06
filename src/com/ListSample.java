package com;

import java.util.ArrayList;
import java.util.List;

public class ListSample {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("jan");
        stringList.add("kuba");
        stringList.add("mateusz");

        for(int i=0; i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }

        System.out.println(stringList.contains("jan"));
        System.out.println(stringList.size());

        stringList.remove(1);

        System.out.println(stringList.size());
        System.out.println(stringList.contains("kuba"));

    }
}
