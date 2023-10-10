public class DashesAndNums {
    public static void main (String[] args) {
        int size = 5;
        for (int lines = 1; lines <= size; lines++) {
            System.out.print("-");
            for (int dashes = 1; dashes <= size - lines; dashes++) {
                System.out.print("-");
            }
            for (int nums = 1; nums <= (2 * lines - 1); nums++) {
                System.out.print(2 * lines - 1);
            }
            for (int dashes = 1; dashes <= size - lines; dashes++) {
                System.out.print("-");
            }
            System.out.print("-");
            System.out.println();
        }
    
    }
}