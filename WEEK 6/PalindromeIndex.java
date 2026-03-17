class PalindromeIndex {
    public static int palindromeIndex(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (isPalindrome(s, l + 1, r)) return l;
                if (isPalindrome(s, l, r - 1)) return r;
                return -1;
            }
            l++;
            r--;
        }
        return -1;
    }

    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}