package com.company;


import java.util.ArrayList;
import java.util.List;

class DistributionSystem implements Observer {
    private Integer distribution = new Integer(0);
    private List<Sity> sities = new ArrayList<>();

    public void addObservable(Sity sity) {
        sity.registerObserver(this);
        sities.add(sity);
    }

    @Override
    public void update(Sity sity) {
        int globalPopulation = 0;
        for(Sity index : sities){
            globalPopulation += index.getPopulation();
        }
        Double meanPopulation = (double) (globalPopulation / sities.size());
        distribution = sity.getPopulation() - meanPopulation.intValue();
        sity.setPopulation(sity.getPopulation() - distribution);
        while (distribution != 0) {
            for (Sity sity1 : sities) {
                if(distribution > 0 && sity1 != sity) {
                    --distribution;
                    sity1.setPopulation(sity1.getPopulation() + 1);
                }
            }
        }
    }

    public void showSitiesInfo(){
        for (Sity sity : sities) {
            sity.showSityInfo();
        }
    }
}