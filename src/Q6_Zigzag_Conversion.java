public class Q6_Zigzag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        int n = s.length();
        int t = 2*numRows - 2;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
//            枚举行
            for (int j = 0; j <= n/t; j++) {
//                枚举周期
                if (j * t + i < n)
                    result.append(s.charAt(j * t + i));
                if (i > 0 && i < numRows - 1 && t + j*t - i < n)
                    result.append(s.charAt(t + j*t - i));
            }
        }

        return result.toString();
    }
}

