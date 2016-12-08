package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DistributionSystem system = new DistributionSystem();
        List<Sity> sities = new ArrayList<>();
        sities.add(new Sity("Саратов"));
        sities.add(new Sity("Москва"));
        sities.add(new Sity("Новгород"));
        sities.add(new Sity("Смоленск"));
        for(Sity sity : sities) {
            system.addObservable(sity);
        }
        sities.get(0).migrating(30);
        sities.get(2).migrating(20);
        system.showSitiesInfo();
    }
}
