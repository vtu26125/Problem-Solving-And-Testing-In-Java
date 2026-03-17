import java.util.*;

class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        System.out.println(set.size());
    }
}