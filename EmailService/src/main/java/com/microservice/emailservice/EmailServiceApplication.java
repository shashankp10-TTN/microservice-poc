package com.microservice.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//@SpringBootApplication
public class EmailServiceApplication {

    public static void main(String[] args) {

//        SpringApplication.run(EmailServiceApplication.class, args);
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // {dist, val}
        minHeap.add(new int[]{0, src});
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e9);
        dist[src] = 0;
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();

        }

    }

}
