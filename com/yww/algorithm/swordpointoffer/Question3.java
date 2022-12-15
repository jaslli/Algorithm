package com.yww.algorithm.swordpointoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 *      数组中重复的数字
 *      在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 *      请找出数组中任意一个重复的数字。
 *
 * </p>
 *
 * @author yww
 * @since 2022/12/15 11:21
 */
public class Question3 {

    /**
     *      使用set集合去重
     */
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    /**
     *      原地交换
     */
    public int findRepeatNumber2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i == nums[i]) {
                i++;
                continue;
            }
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }

}
