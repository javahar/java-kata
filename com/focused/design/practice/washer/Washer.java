package com.focused.design.practice.washer;

public class Washer {


    public void startWash(int num_of_clothes) throws Exception {

        Timer timer = new Timer();
        System.out.println("started washing clothes");
        boolean timerdone= timer.startTimer();
        if(timerdone) {
            buzz();
            finish();
        }
    }

    private void buzz() {
        System.out.println("buzzz ..... washing done");
    }

    public void finish() {
        System.out.println("finished wash");
    }

    public void loadClothes() {

    }

    public void addDetergent() {

    }

}
