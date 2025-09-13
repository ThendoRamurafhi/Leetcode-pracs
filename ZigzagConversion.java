import java.util.ArrayList;
import java.util.Scanner;

public class ZigzagConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayList<Character> arrlist = new ArrayList<>();

        for(int i = 0; i < input.length(); i++){
            
            arrlist.add(input.charAt(i));
        }

        // for (int i = 0; i < arrlist.size(); i++) {
        //     System.out.print(arrlist.get(i));
        // }

        char[][] yh = new char[3][arrlist.size()];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < arrlist.size(); j ++ ){
                yh[i][j] = (char) j;            
            }
        }

        for (int i = 0; i < arrlist.size(); i++){
            for (int j = 0; j < arrlist.size(); j++){
                System.out.println(yh[i][j]);
            }
        }

        int row = 0, col = 0;
        
    }
}
