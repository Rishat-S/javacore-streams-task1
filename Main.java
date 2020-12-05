package javacore.streams.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> list = new ArrayList<>();

        for (int i : input) {
            list.add(i);
        }

        List<Integer> posList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer > 0) {
                posList.add(integer);
            }
        }

        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : posList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }

        int count = evenList.size();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < count; i++) {
                if (evenList.get(i) < evenList.get(i - 1)) {
                    Integer tmp = evenList.get(i);
                    evenList.set(i, evenList.get(i - 1));
                    evenList.set(i - 1, tmp);
                    isSorted = false;
                }
            }
            count--;
        }

        for (Integer integer : evenList) {
            System.out.print(integer + " ");
        }

    }
}
