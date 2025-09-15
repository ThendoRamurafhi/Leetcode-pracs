import java.util.ArrayList;
import java.util.Scanner;

public class ZigzagConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayList<Character> arrlist = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            arrlist.add(input.charAt(i));
        }

        int numRows = 3; // you can change this
        if (numRows == 1 || numRows >= arrlist.size()) {
            System.out.println(input);
            return;
        }

        // create 2D grid, fill with spaces
        char[][] yh = new char[numRows][arrlist.size()];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < arrlist.size(); j++) {
                yh[i][j] = ' ';
            }
        }

        // zigzag traversal
        int row = 0;
        int col = 0;
        boolean goingDown = true;

        for (char c : arrlist) {
            yh[row][col] = c;

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        // print the zigzag grid
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < arrlist.size(); j++) {
                System.out.print(yh[i][j]);
            }
            System.out.println();
        }

        // also collect result row by row
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < arrlist.size(); j++) {
                if (yh[i][j] != ' ') {
                    result.append(yh[i][j]);
                }
            }
        }

        System.out.println("Converted: " + result.toString());
    }
}
