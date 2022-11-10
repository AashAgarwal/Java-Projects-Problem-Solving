package battleship;

import java.util.Arrays;

public class Main {

    public static String[][] createGameField() {
        String[][] gameField = new String[10][10];
        Arrays.setAll(gameField, i -> "~");
        return gameField;
    }

    public static void main(String[] args) {
        // Write your code here
        System.out.println(Arrays.deepToString(createGameField()));
    }
}
