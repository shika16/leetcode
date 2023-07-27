package com.leetcode.twosum;

import com.leetcode.Solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
        Solution sol;

    @BeforeEach
    public void setUpBeforeClass() throws Exception{
        sol = new Solution();
    }
    
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
void matchTarget(){
    int[] nums = new int[]{2,3,4,6};
    int[] result =sol.twoSum(nums, 7);
    System.out.println(Arrays.toString(result));
    int[] expectedResult = new int[]{1,2};
    assertEquals(Arrays.toString(expectedResult),Arrays.toString(result));
}

@Test
void noMatchTarget(){
    int[] numbers = new int[]{1,2,3,4,5};
    int[] result = sol.twoSum(numbers, 11);
    System.out.println(Arrays.toString(result));
    assertEquals(Arrays.toString(result), Arrays.toString(new int[]{}));
}
}
