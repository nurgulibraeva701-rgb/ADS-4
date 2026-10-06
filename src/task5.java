import java.util.*;

class Node implements Comparable<Node> {
    String city;
    int distance;

    public Node(String city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return this.distance - other.distance;
    }
}

public class task5 {

    private Map<String, List<Node>> graph = new HashMap<>();

    public task5() {

        graph.put("Edinburgh", Arrays.asList(
                new Node("Perth", 70),
                new Node("Glasgow", 50)
        ));

        graph.put("Perth", Arrays.asList(
                new Node("Dundee", 25)
        ));
        graph.put("Glasgow", new ArrayList<>());
        graph.put("Dundee", new ArrayList<>());
    }

    public void task5(String start) {

        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (String city : graph.keySet()) {
            distances.put(city, Integer.MAX_VALUE);
        }

        distances.put(start, 0);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            for (Node neighbor : graph.get(current.city)) {
                int newDistance = distances.get(current.city) + neighbor.distance;

                if (newDistance < distances.get(neighbor.city)) {
                    distances.put(neighbor.city, newDistance);
                    pq.add(new Node(neighbor.city, newDistance));
                }
            }
        }

        System.out.println("Shortest distance from Edinburgh to Dundee: "
                + distances.get("Dundee"));
    }

    public static void main(String[] args) {
        task5 graph = new task5();
        graph.task5("Edinburgh");
    }
}
