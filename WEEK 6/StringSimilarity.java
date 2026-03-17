class StringSimilarity {
    public static int stringSimilarity(String s) {
        int total = s.length();
        for (int i = 1; i < s.length(); i++) {
            int j = 0;
            while (i + j < s.length() && s.charAt(j) == s.charAt(i + j)) {
                j++;
            }
            total += j;
        }
        return total;
    }
}