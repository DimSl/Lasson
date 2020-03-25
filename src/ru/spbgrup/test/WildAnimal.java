package ru.spbgrup.test;

public class WildAnimal {
    protected String titleWA;
    protected int weight;
    protected int speed;
    protected int strong;

    public WildAnimal(String titleWA, int weight, int speed, int strong) {
        setTitleWA(titleWA);
        setWeight(weight);
        setSpeed(speed);
        setStrong(strong);
    }

    public String getTitleWA() {
        return titleWA;
    }

    public void setTitleWA(String titleWA) {
        this.titleWA = titleWA;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }
}
