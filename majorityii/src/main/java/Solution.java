import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mcccr on 16-9-26.
 */
public class Solution {
    public static List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int number1 = nums[0], number2 = nums[0], count1 = 0, count2 = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == number1) {
                count1++;
            }
            else if (nums[i] == number2) {
                count2++;
            }
            else if (count1 == 0) {
                number1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                number2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        result.add(number1);
        result.add(number2);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,2,3};
        int[] ee = a.clone();

        majorityElement(a);
        int b = 2;
        int c = b >> 2;
        StringBuilder s = new StringBuilder();
        s.append(1);
        s.append(2);
        s.append(3);
        s.append(4);

        String f = s.reverse().toString();
        f.charAt(2);
        int k = f.charAt(2) - '0';
    }
}
