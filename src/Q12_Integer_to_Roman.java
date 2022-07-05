public class Q12_Integer_to_Roman {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int currentValue = values[i];
            while (num >= currentValue) {
                num -= currentValue;
                res.append(symbols[i]);
            }
            if (num == 0)
                break;
        }
        return res.toString();
    }
}
