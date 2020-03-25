package ru.spbgrup.test;

public class Pet {
    protected String nickname;
    protected int weight;
    protected int speed;
    protected int health;
    protected int amountOfResources;

    public Pet(String nickname, int weight, int speed, int health, int amountOfResources) {
        setNickname(nickname);
        setWeight(weight);
        setSpeed(speed);
        setHealth(health);
        setAmountOfResources(amountOfResources);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAmountOfResources() {
        return amountOfResources;
    }

    public void setAmountOfResources(int amountOfResources) {
        this.amountOfResources = amountOfResources;
    }
}
