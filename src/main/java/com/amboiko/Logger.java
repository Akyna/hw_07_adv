package com.amboiko;

public class Logger implements Runnable {
    private final Mine mine;

    public Logger(Mine mine) {
        this.mine = mine;
        new Thread(this).start();
    }


    @Override
    public void run() {
        while (mine.getGoldQuantity() > Mine.QUANTITY_AT_A_TIME) {
            try {
                Thread.sleep(1000);
                System.out.println("REST OF THE GOLD: " + mine.getGoldQuantity());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
