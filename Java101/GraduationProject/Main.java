public class Main {
    public static void main(String[] args) {
        System.out.println("\033c");
        MineSweeper mineSweeper = new MineSweeper(5, 5);
        mineSweeper.run();
    }
}
