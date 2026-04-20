class Solution {

    long fuel = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] r : roads) {
            adj.get(r[0]).add(r[1]);
            adj.get(r[1]).add(r[0]);
        }

        dfs(0, -1, adj, seats);
        return fuel;
    }

    private int dfs(int node, int parent, List<List<Integer>> adj, int seats) {
        int people = 1;

        for (int nei : adj.get(node)) {
            if (nei == parent) continue;
            people += dfs(nei, node, adj, seats);
        }

        if (node != 0) {
            fuel += (people + seats - 1) / seats; // ceil
        }

        return people;
    }
}