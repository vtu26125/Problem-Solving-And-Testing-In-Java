import java.util.*;
class PatternMatchingWords {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words)
            if (match(word, pattern)) res.add(word);
        return res;
    }
    private boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> rev = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i), p = pattern.charAt(i);
            if (map.containsKey(w) && map.get(w) != p) return false;
            if (rev.containsKey(p) && rev.get(p) != w) return false;
            map.put(w, p);
            rev.put(p, w);
        }
        return true;
    }
}