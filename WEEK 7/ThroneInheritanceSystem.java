import java.util.*;

class ThroneInheritanceSystem {
    Map<String, List<String>> tree = new HashMap<>();
    Set<String> dead = new HashSet<>();
    String king;

    public ThroneInheritanceSystem(String kingName) {
        king = kingName;
        tree.put(king, new ArrayList<>());
    }

    public void birth(String parent, String child) {
        tree.putIfAbsent(parent, new ArrayList<>());
        tree.get(parent).add(child);
        tree.put(child, new ArrayList<>());
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> res = new ArrayList<>();
        dfs(king, res);
        return res;
    }

    private void dfs(String node, List<String> res) {
        if (!dead.contains(node)) res.add(node);
        for (String child : tree.get(node))
            dfs(child, res);
    }
}