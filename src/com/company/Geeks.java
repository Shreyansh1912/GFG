package com.company;

import java.util.PriorityQueue;

class Geeks{

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){

        // Your code here
        //Just insert k in q and don't return anything
        q.offer(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){

        // Your code here
        // If k is in q return true else return false
        if(q.contains(k)){
            return true;
        }
        return false;


    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q){

        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
        int max=0;
        for(int i :q){
            if(max<i){
                max=i;
            }
        }
        if(q.size()!=0){
            q.remove(max);
        }

        return max;


    }
}
