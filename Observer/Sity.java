package com.company;

import java.util.ArrayList;
import java.util.List;


public class Sity implements Observable {
    private String name;
    private Integer population = new Integer(0);
    private List<Observer> observers = new ArrayList<>();

    public Sity(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this);
        }
    }

    public void migrating(int newPeople){
        population += newPeople;
        notifyObservers();
    }

    public void showSityInfo(){
        System.out.println(name + " " + population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
