package com.focused.design.practice.washer;

public class Enabler {

    public static void main(String[] args) throws Exception{
        User user = new User();
        user.loadClothes();
        user.addDetergent();
        user.turnOnWasher();
    }
}
