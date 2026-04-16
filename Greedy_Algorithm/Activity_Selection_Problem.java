package com.company.Greedy_Algorithm;

import java.util.*;

public class Activity_Selection_Problem {

    public static int maxActivities(int start[], int end[]) {
        int n = start.length;

        int[][] activities = new int[n][3];

        for(int i = 0; i < n; i++){

                    activities[i][0] = i;            // index
                    activities[i][1] = start[i];     // start
                    activities[i][2] = end[i];      // finish
                }
                //SORTING
                Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

                int count = 1;
                int lastEnd = activities[0][2];

                for(int i = 1; i < n; i++){
                    if(activities[i][1] >= lastEnd){
                        count++;
                        lastEnd = activities[i][2];
                    }
                }

                return count;
    }

        public static void main(String[] args) {
            int start[] = {1,2,3,4,7,8,9,9,11,12};
            int end[]   = {3,5,4,7,10,9,11,13,12,14};



            int result = maxActivities(start, end);
            System.out.println("Max Activities = " + result);
        }
    }
