package com.edhesive.apcs.assignments.term2.assn5;

public class Main {

    public static void main(String[] args) {
        GameWheel wheel = new GameWheel();
        int totalPrizeMoney = 0;
        // flag variable keeps track of whether or not the same colors were spun for double money at end
        boolean flag = true;

        Slice slice1 = wheel.spinWheel();
        totalPrizeMoney += slice1.getPrizeAmount();
        Slice slice2 = wheel.spinWheel();
        totalPrizeMoney += slice2.getPrizeAmount();
        if(!slice2.getColor().equals(slice1.getColor())) flag = false;
        Slice slice3 = wheel.spinWheel();
        totalPrizeMoney += slice3.getPrizeAmount();
        if(!slice3.getColor().equals(slice2.getColor())) flag = false;
        if(flag) totalPrizeMoney *= 2;

        System.out.println("Total prize money: $" + totalPrizeMoney);
        System.out.println();
        System.out.println("Spin 1 - " + slice1.toString());
        System.out.println("Spin 2 - " + slice2.toString());
        System.out.println("Spin 3 - " + slice3.toString());
        if(flag) {
            System.out.println("Three " + slice1.getColor() + "s = double your money!");
        }
    }

}
