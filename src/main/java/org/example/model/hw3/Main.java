package org.example.model.hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boock book1 = new Boock("книга 1", "Есенин", 320, 1997, 217);
        Boock book2 = new Boock("книга 2", "Есенин", 290, 2008, 334);
        Boock book3 = new Boock("книга 3", "Есенин", 550, 1996, 251);
        Boock book4 = new Boock("книга 4", "Некрасов", 550, 2012, 619);
        Boock book5 = new Boock("книга 5", "Некрасов", 1358, 2015, 619);
        Boock book6 = new Boock("книга 6", "Некрасов", 150, 1997, 109);

        List<Boock> boockList = new ArrayList<>();
        boockList.add(book1);
        boockList.add(book2);
        boockList.add(book3);
        boockList.add(book4);
        boockList.add(book5);
        boockList.add(book6);

        for(int i = 0; i<boockList.size(); i++){
            System.out.println(boockList.get(i));
        }

        System.out.println();

        for (int i = 0; i < boockList.size(); i++) {
            if ( (boockList.get(i).getFio().contains("а")) && (boockList.get(i).getDate() > 2009) ){
                if (Prost(boockList.get(i).getStroki())){
                    System.out.println(boockList.get(i).getName());
                }
            }
        }
    }

    public static boolean Prost(int a){

        for (int i = 2; i < a; i++) {
            if (a % i == 0 && i != a){
                return false;
            }
        }
        return true;
    }
}
