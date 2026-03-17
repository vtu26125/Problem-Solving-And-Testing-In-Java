import java.util.*;

class JavaIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}