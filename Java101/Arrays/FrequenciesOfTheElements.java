package Java101.Arrays;

import java.util.Arrays;

public class FrequenciesOfTheElements {
    public static void main(String[] args) {
        System.out.println("\033c");
        Integer list[] = {10, 20, 20, 10, 10, 20, 5, 20, 99, 22, 88, 99, 17};
        
        int range = Arrays.stream(list).max(Integer::compare).orElse(0);
        
        Integer checkerList[][] = new Integer[range][2];

        for (int i = 0; i < range; i++) {
            checkerList[i] = new Integer[2];
            checkerList[i][0] = i + 1;
            checkerList[i][1] = 0;
        }

        for (int i = 0; i < list.length; i++) {
            int index = list[i] - 1;
            checkerList[index][1]++;
        }

        System.out.println("Number\t\tFrequency");
        for (int i = 0; i < range; i++) {
            if (checkerList[i][1] > 0) {
                System.out.println(checkerList[i][0] + "\t\t" + checkerList[i][1]);
            }
        }
    }
}
