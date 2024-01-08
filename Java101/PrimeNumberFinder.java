public class PrimeNumberFinder {
    public static void main(String[] args) {
        for (int i = 2; i <=100; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num){
        boolean isPrime = true;
        if (num < 2) {
            return false;
        } else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
        }
    }
}
