package org.example.model.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kubic kub1 = new Kubic(3, "желтый", "дерево");
        Kubic kub2 = new Kubic(3, "зеленый", "металл");
        Kubic kub3 = new Kubic(4, "красный", "картон");
        Kubic kub4 = new Kubic(2, "желтый", "сталь");

        List<Kubic> kubicList = new ArrayList<>();
        kubicList.add(kub1);
        kubicList.add(kub2);
        kubicList.add(kub3);
        kubicList.add(kub4);
        System.out.println(kubicList);

        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (int i = 0; i < kubicList.size(); i++) {
            Kubic kube = kubicList.get(i);
            if (kube.getColor().equals("желтый")) {
                k++;
                volume += volumeKube(kubicList.get(i).getSize());
            }
            if ((kube.getMaterial().equals("дерево")) && (kube.getSize() == 3)) {
                kWood++;
            }
        }
        System.out.println("1 пункт: " + k + " объем " + volume);
        System.out.println("2 пункт: " + kWood);
    }

    private static Integer volumeKube(Integer size) {
        return size * size * size;
    }
}
