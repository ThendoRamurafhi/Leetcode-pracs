import java.util.*;

public class IntToRomans {
    public String intToRoman(int num) {
        // LinkedHashMap preserves insertion order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                sb.append(entry.getValue());
                num -= entry.getKey();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        IntToRomans converter = new IntToRomans();
        System.out.println(converter.intToRoman(3749)); // MMMDCCXLIX
        System.out.println(converter.intToRoman(58)); // LVIII
        System.out.println(converter.intToRoman(1994)); // MCMXCIV
    }
}
