class Solution {

    private final int MAX = 1000000;

    private boolean isValid(int i, int j, int n) {
        if (i < 0 || j < 0 || i >= n || j >= n)
            return false;

        return true;
    }

    public int minimumCostPath(int[][] grid) {
        PriorityQueue<Node> pq = new PriorityQueue<>((n0, n1) -> n0.weight - n1.weight);

        boolean[][] visited = new boolean[grid.length][grid.length];

        // movements
        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };

        int[][] dist = new int[grid.length][grid.length];
        // initialize distances to MAX
        for (int[] x : dist) {
            Arrays.fill(x, MAX);
        }

        dist[0][0] = grid[0][0];
        pq.add(new Node(0, 0, grid[0][0]));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            int x = current.i;
            int y = current.j;

            if (visited[x][y]) {
                continue;
            }

            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                if (isValid(x + dx[i], y + dy[i], grid.length)) {
                    // relaxation
                    if (dist[x][y] + grid[x + dx[i]][y + dy[i]] < dist[x + dx[i]][y + dy[i]]) {
                        dist[x + dx[i]][y + dy[i]] = dist[x][y] + grid[x + dx[i]][y + dy[i]];
                        pq.add(new Node(x + dx[i], y + dy[i], dist[x + dx[i]][y + dy[i]]));
                    }
                }
            }
        }

        return dist[grid.length - 1][grid.length - 1];
    }
}

class Node {
    int i;
    int j;
    int weight;

    public Node(int i, int j, int weight) {
        this.i = i;
        this.j = j;
        this.weight = weight;
    }
}