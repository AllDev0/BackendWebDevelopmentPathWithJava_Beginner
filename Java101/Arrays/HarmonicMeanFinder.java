package Java101.Arrays;

public class HarmonicMeanFinder {
    public static void main(String[] args) {
        System.out.println("\033c");
        int size = 10;
        int arr[] = new int[size];
        double sum = 0.0;
        for(int i = 1; i <= size; i++){
            arr[i-1] = i;
        }
        for(int i : arr){
            sum += (1.0 / i);
        }

        System.out.println("Harmonic Mean : " + (size / sum));

    }
}
