public class Switch {
    public static void main(String[] args) {
        int x = 2;
        int y = switch (x) {
            case 1 -> 2;
            case 2 -> 4;
            case 3 -> 3;
            default -> 1;
        };
    }
}
