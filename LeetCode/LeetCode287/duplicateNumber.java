package LeetCode.LeetCode287;

public class duplicateNumber {
    public static void main(String[] args) 
    {
        int[] nums = {1,3,4,2,2};
        duplicateNumber obj = new duplicateNumber();
        int result = obj.findDuplicate(nums);
        System.out.println("Duplicate number: " + result);
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}