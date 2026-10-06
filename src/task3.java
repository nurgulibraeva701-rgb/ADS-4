import java.util.*;

public class task3 {

    private Map<String, List<String>> graph = new HashMap<>();

    public task3() {
        graph.put("A", Arrays.asList("C", "B", "D"));
        graph.put("B", Arrays.asList("A", "C", "E", "G"));
        graph.put("C", Arrays.asList("A", "B", "D"));
        graph.put("D", Arrays.asList("C", "A"));
        graph.put("E", Arrays.asList("G", "F", "B"));
        graph.put("F", Arrays.asList("G", "E"));
        graph.put("G", Arrays.asList("F", "B"));
    }

    // DFS Algorithm
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(String vertex, Set<String> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (String neighbor : graph.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // BFS Algorithm
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            System.out.print(vertex + " ");

            for (String neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task3 g = new task3();

        g.dfs("A");
        g.bfs("A");
    }
}