package com.java.collections;

import java.util.*;

class Collection{

    int process(ArrayDeque<Integer> deque, int subsetSize){

        HashSet<Integer> identical = new HashSet<>();            // store unique sizes of subsets
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();  // store all he actual sizes

        int subsetsNumber = deque.size() - subsetSize + 1; // total number of possible subsets

        for (int i = 0; i < subsetsNumber; i++) {
            Object[] deqAsArray = deque.toArray();
            int loopCount = deque.size()-1;
            for (int j = 0; j < subsetSize; j++) {
                identical.add((Integer) deqAsArray[loopCount-j]);
            }
            // Remove last element
            deque.removeLast();
            // add size of subset to a list
            uniqueSizesList.add(identical.size());

            //clear the hash set on every iteration of each subset creation
            identical.clear();
        }
        return DetermineMax(uniqueSizesList);
    }
    // find the highest number
    int DetermineMax(ArrayList<Integer> uniqueSizes){
        int highest = 0;
        for(Integer num : uniqueSizes){
            if(num > highest){
                highest = num;
            }
        }
        return highest;
    }
}