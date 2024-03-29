/**
315. Count of Smaller Numbers After Self
Hard

You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].

Example:

Input: [5,2,6,1]
Output: [2,1,1,0] 
Explanation:
To the right of 5 there are 2 smaller elements (2 and 1).
To the right of 2 there is only 1 smaller element (1).
To the right of 6 there is 1 smaller element (1).
To the right of 1 there is 0 smaller element. 
 */

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CountSmaller2 {

    public static void main(String[] args) {
        int[] input = {
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80,
            10, 2, 5, 101, 6, 100 ,2, 6, 105, 6, 30, 5, 250, 11, 93, 6, 100, 2, 5, 6, 6, 99, 80
        };         
        CountSmaller2 cs = new CountSmaller2();
        long start = System.currentTimeMillis();
        List<Integer> output = cs.countSmaller(input);
        long elapse = System.currentTimeMillis() - start;
        System.out.printf("output: %s%n", output);
        System.out.printf("elapse time: %d%n", elapse);
    }

    /**
     * copyright: the author of a LeetCode submission
     */
    public List<Integer> countSmaller(int[] nums) {
        if(nums.length==0) return Collections.emptyList();
        Integer[] ans = new Integer[nums.length];

        Node head = new Node(nums[nums.length-1]);
        ans[nums.length-1] = 0;
        for(int i = nums.length - 2; i >= 0; i--) {
            ans[i] = insert(head, nums[i], 0);
        }
        return Arrays.asList(ans);
    }

    private int insert(Node node, int num, int leftCount) {

        if(node.val == num) {

            node.count++;
            leftCount += node.leftCount;

        } else if(node.val < num) {

            leftCount += node.count + node.leftCount;
            if(node.right==null) {
                node.right = new Node(num);
            } else {
                leftCount = insert(node.right, num, leftCount);
            }
        } else {

            node.leftCount++;
            if(node.left==null) {
                node.left = new Node(num);
            } else {
                leftCount = insert(node.left, num, leftCount);
            }
        }
        return leftCount;
    }

    static class Node {
        int val;
        int count;
        int leftCount;
        Node left;
        Node right;

        Node(int val) {
            count = 1;
            this.val = val;
        }

        public String toString() {
            return "["+val+", "+count+", "+leftCount+", "+left+", "+right+"]";
        }
    }

}
