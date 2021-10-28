package day04;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Boolean> prison = new ArrayList<>();
    private List<Integer> listOfFreePrison = new ArrayList<>();

    public void fillPrison(int number, boolean lockStatus) {
        for (int i = 0; i < number; i++) {
            prison.add(i, lockStatus);
        }
    }

    public int getPrisonSize() {
        return prison.size();
    }
    public List<Integer> getListOfFreePrison() {
        for (int i = 0; i < prison.size(); i++) {
            if (prison.get(i) == true){
                listOfFreePrison.add(i+1);
            }
        }
        return listOfFreePrison;
    }

    public boolean getPrisoner (int number) {
        return prison.get(number);
    }

    public void openFreeCells() {
        for (int i = 1; i <= 100 ; i++) {
            for (int j = i - 1; j < prison.size(); j += i) {
                if (prison.get(j)) {
                    prison.set(j, false);
                } else {
                    prison.set(j, true);
                }
            }
        }
    }
}