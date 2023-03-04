package org.example.model.hw1;

import org.example.model.cw3.Kubic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tovar tov1 = new Tovar("высший помидор", 35, 1);
        Tovar tov2 = new Tovar("помидор", 25, 2);
        Tovar tov3 = new Tovar("огурец обычный", 15, 3);
        Tovar tov4 = new Tovar("огурец длинный", 18, 2);
        Tovar tov5 = new Tovar("тыква", 50, 2);
        Tovar tov6 = new Tovar("высший огурец", 27, 1);
        Tovar tov7 = new Tovar("высший салат", 30, 1);
        Tovar tov8 = new Tovar("салат обычный", 19, 2);
        Tovar tov9 = new Tovar("рыба сушенная", 35, 3);
        Tovar tov10 = new Tovar("высший рыба свежаяя", 55, 2);

        List<Tovar> tovarList = new ArrayList<>();
        tovarList.add(tov1);
        tovarList.add(tov2);
        tovarList.add(tov3);
        tovarList.add(tov4);
        tovarList.add(tov5);
        tovarList.add(tov6);
        tovarList.add(tov7);
        tovarList.add(tov8);
        tovarList.add(tov9);
        tovarList.add(tov10);
        //System.out.println(tovarList + "\n");
        for(int i = 0; i<tovarList.size(); i++){
            System.out.println(tovarList.get(i));
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i < tovarList.size(); i++) {
            if (tovarList.get(i).getName().contains("Высший")){
                System.out.println(tovarList.get(i));
                if (tovarList.get(i).getPrice() > sum){
                    sum = tovarList.get(i).getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена товара: " + sum);
    }
}
