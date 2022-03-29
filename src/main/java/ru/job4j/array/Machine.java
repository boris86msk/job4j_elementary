package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    @SuppressWarnings("checkstyle:LeftCurly")
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
            for (int i = 0; i < coins.length; i++) {
                if (cash / coins[i] > 0) {
                    for (int j = 0; j <= cash / coins[i]; j++) {
                        rsl[size] = coins[i];
                        size++;
                        cash -= coins[i];
                    }
                }
                if (cash <= 0) {
                    break;
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
