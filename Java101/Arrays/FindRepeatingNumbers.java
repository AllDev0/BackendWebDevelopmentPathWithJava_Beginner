package Java101.Arrays;

import java.util.Arrays;

public class FindRepeatingNumbers {
    public static void main(String[] args) {
        int list[] = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 4, 6, 8, 2, 2, 10};
        int evenList[] = Arrays.stream(list).filter( x -> x % 2 == 0).toArray();
        int duplicateList[] = new int[evenList.length];
        int startIndex = 0;
        for(int i=0; i<evenList.length; i++) {
            for(int j=0; j<evenList.length; j++) {
                if ((i != j) && (evenList[i] == evenList[j])) {
                    int index = i;
                    if (!Arrays.stream(duplicateList).anyMatch(n -> n == evenList[index])) {
                        duplicateList[startIndex++] = evenList[index];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(duplicateList));
    }
}
