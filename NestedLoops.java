public class NestedLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int num = 9; num >= 0; num--) {
                for (int count = 0; count < 3; count++) {
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}
