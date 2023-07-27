package com.leetcode.twosum;
import java.util.Arrays;

import com.leetcode.Solution;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSum(new int[]{2,3,4,5}, 7);
        System.out.println("Result is: "+Arrays.toString(result));
    }
}
