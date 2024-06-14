/* You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

Return the minimum number of moves to make every value in nums unique.

The test cases are generated so that the answer fits in a 32-bit integer.*/
package day5leetcode;

import java.util.*;

public class minimumMoves {
    public  static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
              int inc=nums[i-1]-nums[i]+1;
                nums[i]=nums[i]+inc;
                moves=moves+inc;
            }
           
        }
         return moves;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size n value");
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("minimum moves "+ minIncrementForUnique(nums));
        sc.close();
        
    }
}
