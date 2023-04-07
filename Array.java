// Auto-generate and fill an array of 100 integers based on the below rules.
 
// Each number has to be a multiple of 9 starting from 9 (9, 18, 27, 36,….)
// Take the last two digits of each number. If the difference between the last two digits is 3, make the number a negative value.
 
// Ex. 36. The difference between 3 and 6 is 3. Hence it should be stored as -36
// 63. The difference between 6 and 3 is 3. Hence it should be stored as -63.
// Another example is 225. The last two digits are 2 and 5. The difference is 3. The number should be stored as -225.
 
// Display all the 100 such numbers.


import java.util.Arrays;

public class Array
{
    public static void main(String[] args) {
        int [] nums = new int [100];
        for ( int i = 0; i<nums.length;i++){
            int num =(i+1)*9;
            int lastDigit = num % 100;
            if (lastDigit % 10 != 3 && (lastDigit/10) % 10 != 3){
                nums[i] = num;

            }
            else{
                nums[i]= -num;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
