package Practice;

import java.util.ArrayList;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(9);
        list.add(1);

        int min = list.get(0);

        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Minimum: " + min);
    }
    
  
}
