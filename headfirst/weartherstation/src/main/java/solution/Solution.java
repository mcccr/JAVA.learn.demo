package solution;

/**
 * Created by mcccr on 16-9-21.
 */
public class Solution {
    public int majorityElemtens(int[] nums) {
        int count = 0;
        int majority = 0;
        for (int i : nums) {
            if (count == 0) {
                count = 1;
                majority = i;
            }
            else if (i == majority) {
                count ++;
            }

            else {
                count --;
            }
        }

        count = 0;

        for (int i : nums) {
            if (i == majority) {
                count ++;
            }
        }

        if (count >= nums.length/2) {
            return majority;
        }
        return -1;
    }



}
