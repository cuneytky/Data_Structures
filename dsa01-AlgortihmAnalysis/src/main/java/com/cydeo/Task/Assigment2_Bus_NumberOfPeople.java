package com.cydeo.Task;

import java.util.ArrayList;

public class Assigment2_Bus_NumberOfPeople {
    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0}); //first stop
        busStops.add(new int[] {3,5});
        busStops.add(new int[] {2,5}); // last stop
        System.out.println(countPassengers(busStops));

    }

    public static int countPassengers(ArrayList<int[]> stops){
        //runs in 0 complexity because there is a single loop with size n
        int numOfPeople = 0;
        for (int i = 0; i < stops.size() ; i++) {
            numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numOfPeople;
    }


}
/*
Assignment-2 (Number of People in the Bus)
1. There is a bus moving in the city, and it takes and drop some people in each bus stop.
You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people
get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.
Your task is to return number of people who are still in the bus after the last bus station (after the last
array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and
they are probably sleeping there :D
Take a look on the test cases next page.
Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So
the return integer can't be negative.
The second value in the first integer array is 0, since the bus is empty in the first bus stop.
2. What is the time complexity of your solution?

Test Case:
public void test1() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    list.add(new int[] {2,5});
    assertEquals(5, metro.countPassengers(list));
}

Code Template:
import java.util.ArrayList;
class Metro {
      public static int countPassengers(ArrayList<int[]> stops) {
     //Code here!
    }
}
 */