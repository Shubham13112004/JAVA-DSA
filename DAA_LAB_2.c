#include <stdio.h>
#include <limits.h>

struct Edge {
    int src, dest, weight;
};

void bellmanFord(struct Edge edges[], int V, int E, int src) {
    int dist[V];

    
    for (int i = 0; i < V; i++)
        dist[i] = INT_MAX;
    dist[src] = 0;

   
    for (int i = 1; i <= V - 1; i++) {
        for (int j = 0; j < E; j++) {
            int u = edges[j].src;
            int v = edges[j].dest;
            int w = edges[j].weight;

            if (dist[u] != INT_MAX && dist[u] + w < dist[v])
                dist[v] = dist[u] + w;
        }
    }

    
    for (int j = 0; j < E; j++) {
        int u = edges[j].src;
        int v = edges[j].dest;
        int w = edges[j].weight;

        if (dist[u] != INT_MAX && dist[u] + w < dist[v]) {
            printf("Graph contains negative weight cycle\n");
            return;
        }
    }

    
    for (int i = 0; i < V; i++) {
        if (dist[i] == INT_MAX)
            printf("Distance from %d to %d is Infinity\n", src, i);
        else
            printf("Distance from %d to %d is %d\n", src, i, dist[i]);
    }
}

int main() {
    int V, E, src;

    printf("Enter number of vertices: ");
    scanf("%d", &V);

    printf("Enter number of edges: ");
    scanf("%d", &E);

    struct Edge edges[E];

    printf("Enter each edge in the format: src dest weight\n");
    for (int i = 0; i < E; i++) {
        printf("Edge %d: ", i + 1);
        scanf("%d %d %d", &edges[i].src, &edges[i].dest, &edges[i].weight);
    }

    printf("Enter source vertex: ");
    scanf("%d", &src);

    bellmanFord(edges, V, E, src);

    return 0;
}
