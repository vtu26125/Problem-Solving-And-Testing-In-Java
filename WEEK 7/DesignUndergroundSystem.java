import java.util.*;

class DesignUndergroundSystem {
    Map<Integer, Pair> checkIn = new HashMap<>();
    Map<String, int[]> routes = new HashMap<>();

    class Pair {
        String station;
        int time;
        Pair(String s, int t) { station = s; time = t; }
    }

    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, new Pair(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Pair p = checkIn.remove(id);
        String key = p.station + "-" + stationName;
        routes.putIfAbsent(key, new int[2]);
        routes.get(key)[0] += (t - p.time);
        routes.get(key)[1]++;
    }

    public double getAverageTime(String start, String end) {
        int[] data = routes.get(start + "-" + end);
        return (double) data[0] / data[1];
    }
}