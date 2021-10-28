package day04;

import java.util.List;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();

        prison.fillPrison(100, false);

        System.out.println("Basic status");
        for (int i = 0; i < prison.getPrisonSize(); i++) {
            System.out.print(prison.getPrisoner(i) + ",");
        }
        System.out.println();
        System.out.println("----");
        System.out.println();

        prison.openFreeCells();

        int numberOfFreePrisoner = 0;
        for (int i = 0; i < prison.getPrisonSize(); i++) {
            if (prison.getPrisoner(i)){
                numberOfFreePrisoner++;
            }
        }
        System.out.println("Number of free prisoner: "+ numberOfFreePrisoner);

        List<Integer> freeCells = prison.getListOfFreePrison();

           for (int i = 0; i < freeCells.size(); i++) {
            System.out.print(freeCells.get(i) +", ");
        }
    }
}


