package lesson4.GroupTasks;


public class Task1 {
    public static void main(String[] args) {

        int[] nums = {
                2,
                4,
                8
        };

        findThirdDistinct(nums);
    }

    static void findThirdDistinct(int[] nums) {

        int first = nums[0];      // first array element assigned as first
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {    // if element is bigger than first
                first = nums[i];      // assign it as first
            }
        }

        int second = Integer.MIN_VALUE;     // second assigned as min integer value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > second && nums[i] < first) {  //if element is bigger than second and smaller than first
                second = nums[i];     // assign it as second
            }
        }
        int third = Integer.MIN_VALUE;      // third assigned as min integer value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > third && nums[i] < second) {  // if element is bigger than third and smaller than second
                third = nums[i];      // assign it as third
            }

        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third distinct doesn't exist; second is : " + second);
        } else {
            System.out.println("Third distinct maximum is " + third);
        }

    }
}
