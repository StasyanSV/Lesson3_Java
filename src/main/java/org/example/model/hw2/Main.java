package org.example.model.hw2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tovars tov1 = new Tovars("высший помидор", "USA", 5, 45, 1);
        Tovars tov2 = new Tovars("помидор", "USA", 5, 30, 2);
        Tovars tov3 = new Tovars("огурец обычный", "USA", 5, 32, 3);
        Tovars tov4 = new Tovars("огурец длинный", "USA", 5, 38, 2);
        Tovars tov5 = new Tovars("тыква", "USA", 15, 70, 2);
        Tovars tov6 = new Tovars("высший огурец", "USA", 5, 29, 1);
        Tovars tov7 = new Tovars("высший салат", "USA", 5, 29, 1);
        Tovars tov8 = new Tovars("салат обычный", "USA", 5, 20, 3);
        Tovars tov9 = new Tovars("рыба сушенная", "USA", 10, 33, 3);
        Tovars tov10 = new Tovars("высший рыба свежаяя", "USA", 20, 56, 1);

        List<Tovars> tovarsList = new ArrayList<>();
        tovarsList.add(tov1);
        tovarsList.add(tov2);
        tovarsList.add(tov3);
        tovarsList.add(tov4);
        tovarsList.add(tov5);
        tovarsList.add(tov6);
        tovarsList.add(tov7);
        tovarsList.add(tov8);
        tovarsList.add(tov9);
        tovarsList.add(tov10);

        for(int i = 0; i<tovarsList.size(); i++){
            System.out.println(tovarsList.get(i));
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер сорта: 1 - 2 - 3: ");
        int num1 = scan.nextInt();
        scan.close();

        int sum = tovarsList.get(num1 -1).getPrice();
        String nam1 = "";
        for (int i = 0; i < tovarsList.size(); i++) {
            if((tovarsList.get(i).getSort() == num1) && (tovarsList.get(i).getPrice() < sum )){
                sum = tovarsList.get(i).getPrice();
            }
        }
        for (int i = 0; i < tovarsList.size(); i++) {
            if((tovarsList.get(i).getSort() == num1) && (tovarsList.get(i).getPrice() == sum )){
                System.out.println(tovarsList.get(i).getName());
            }
        }
    }

}
