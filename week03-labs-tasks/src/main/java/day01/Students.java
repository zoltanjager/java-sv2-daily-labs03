package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Integer> heights = new ArrayList<>();

    public void addHeight(int height){
        heights.add(height);
    }

    public  boolean isHeightsIncreasing(){
        boolean x = false;
        for (int i = 0; i < heights.size() - 1; i++) {
            if(heights.get(i) < heights.get(i + 1)){
               x = true;
                } else {
                x = false;
            }
        }
        return x;
    }

}
