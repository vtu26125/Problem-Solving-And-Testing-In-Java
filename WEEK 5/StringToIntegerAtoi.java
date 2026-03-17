class StringToIntegerAtoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int sign = 1, i = 0;
        long result = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-')
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i++) - '0');
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) result * sign;
    }
}