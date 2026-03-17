import java.util.*;

class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();
        for (int g : grades) {
            if (g >= 38 && g % 5 >= 3)
                g += (5 - g % 5);
            res.add(g);
        }
        return res;
    }
}