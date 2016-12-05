package controller;


public class User {
    private int carma = 100;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int carma, String name) {
        this.carma = carma;
        this.name = name;
    }

    public int getCarma() {
        return carma;
    }

    public void setCarma(int carma) {
        this.carma = carma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
