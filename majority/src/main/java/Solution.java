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

        return majority;
    }


}
