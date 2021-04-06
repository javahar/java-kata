package com.focused.design.practice.washer;

public class User {

    private Washer washer;

    public User() {
        washer = new Washer();
    }

    public void loadClothes(){
        System.out.println("loading clothes");
        washer.loadClothes();
    }

    public void unloadClothes(){
        System.out.println("unloading clothes");

    }

    public void addDetergent(){
        System.out.println("adding detergent");

    }

    public void turnOnWasher() throws Exception {
        System.out.println("Turning on washer");
        washer.startWash(20);

    }

    public void updateTimer() {

    }
}
