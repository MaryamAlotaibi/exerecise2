import java.util.*;
import java.util.stream.*;
//exercise5$6~~~~
public class factorial1
{
    public static void main(String[] args) {
        int number[] = new int[3];
        number[0]=100;
        number[1]=500;
        number[2]=1000;
        System.out.println(Arrays.toString(number));

        rev()

    }


        public static void ver(String[] args) {

            int[] nums = {1, 2, 3, 4};
            float sum = 0;
            int i=0;
            while(i < nums.length) {
                sum += nums[i];
                i++;
            }

            float rev = (sum / nums.length);

            return rev;
        }
    }
}