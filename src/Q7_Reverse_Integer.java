public class Q7_Reverse_Integer {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) {
                return 0;
            }
            int remainder = x % 10;
            x /= 10;
            result = result * 10 + remainder;
        }

        return result;
    }


}
