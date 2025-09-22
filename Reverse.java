public class Reverse {
    public int reverse(int x) {
        long rev = 0; // use long to handle overflow while computing
        while (x != 0) {
            int digit = x % 10;   // extract last digit
            rev = rev * 10 + digit;
            x /= 10; // remove last digit
        }
        // check overflow
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        int x = -123; 
        int r = rev.reverse(x);
        
        System.out.println(r);
    }
}
