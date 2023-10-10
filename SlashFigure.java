public class SlashFigure {
    public static void main (String[] args) {
        int size = 6;
        for (int lines = 1; lines <= size; lines++) {
            for (int slashes = 1; slashes <= 2 * lines - 2; slashes++) {
                System.out.print("\\");
            }
            for (int slashes = 1; slashes <= -4 * lines + 4 * size + 2; slashes++) {
                System.out.print("!");
            }
            for (int slashes = 1; slashes <= 2 * lines - 2; slashes++) {
                System.out.print("/");
            }
            System.out.println();
        }
    
    }
}
