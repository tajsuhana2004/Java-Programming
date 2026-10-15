/* Question 1 :Monotonic ArrayList (EASY)

An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.

An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

Sample Input 1 : nums = [1,2,2,3]
Sample Output 1 : true */

/* import.java.util.*;
public class ArrayList {
    public boolean isMonotonic(ArrayList<Integer> A){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)>A.get(i+1)){
                inc=false;
            }
            if(A.get(i)<A.get(i+1)){
                dec=false;
            }
        }
        return inc ||dec;
    }
    
}*/

/* Question Number 2: Find the Lonely Numbers In Array

You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.

Return all lonely numbers in nums. You may return the answer in any order.

 

Example 1:

Input: nums = [10,6,5,8]
Output: [10,8]
Explanation: 
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.*/



import java.util.*;

class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        if (n == 1) {
            list.add(nums[0]);
            return list;
        }

        if (nums[0] + 1 < nums[1]) list.add(nums[0]);

        for (int i = 1; i < n - 1; i++) {
            if (nums[i-1] + 1 < nums[i] && nums[i] + 1 < nums[i+1]) {
                list.add(nums[i]);
            }
        }

        if (nums[n-2] + 1 < nums[n-1]) list.add(nums[n-1]);

        return list;
    }
}
    /* Question 3 :
Most Frequent Number following Key (EASY)
You are given an integer Arraylist(Array) nums. You are also given an integer key, which is present in
nums.
For every unique integer target in nums, count the number of times target immediately follows
an occurrence of key in nums. In other words, count the number of indices i such that:
0 <= i <= nums.size() - 2,
nums.get(i) == key and,
nums.get(i+1) == target.
Return the target with the maximum count.
(Assumption - that the target with maximum count is unique.) */

class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001]; // constraints 1 to 1000
        int max = 0, ans = -1;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == key) {
                count[nums[i+1]]++;
                if(count[nums[i+1]] > max) {
                    max = count[nums[i+1]];
                    ans = nums[i+1];
                }
            }
        }
        return ans;
    }
}

/* Question 4 :
Beautiful ArrayList (MEDIUM)

An Arraylist nums of size n is beautiful if:
nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +
nums.get(j).
Given the integer n, return any beautiful arraylist nums of size n. There will be at least one valid
answer for the given n.
Sample Input 1 : n = 4
Sample Output 1 : [2,1,4,3]
Sample Input 2 : n = 5
Sample Output 2 : [3,1,2,5,4]
Constraints :
● 1 <= n <= 1000 */


class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int x : ans) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }
            for (int x : ans) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }
            ans = temp;
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}


